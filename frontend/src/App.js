import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import MapContainer from './components/map';
import { GoogleApiWrapper } from 'google-maps-react';
import { Route, BrowserRouter, Link, Redirect, Switch } from 'react-router-dom'
import { HomeComponent } from './components/Home/'

function PrivateRoute ({component: Component, authed, ...rest}) {
  return (
    <Route
      {...rest}
      render={(props) => authed === true
        ? <Component {...props} />
        : <Redirect to={{pathname: '/login', state: {from: props.location}}} />}
    />
  )
}

function PublicRoute ({component: Component, authed, ...rest}) {
  return (
    <Route
      {...rest}
      render={(props) => authed === false
        ? <Component {...props} />
        : <Redirect to='/dashboard' />}
    />
  )
}

export default class App extends Component {
 
  componentDidMount () {
    
  }
  componentWillUnmount () {
    this.removeListener()
  }
  render() {
    let browserRouter = null;
    if (!this.state.authed) {
      browserRouter =
        <div>
          <nav className="navbar navbar-default navbar-static-top">
            <div className="container">
              <div className="navbar-header">
                <Link to="/home" className="navbar-brand">WandrLove</Link>
              </div>
            </div>
          </nav>
      </div>
    } else {
    <Route path='/home' exact component={HomeComponent} />
    browserRouter =
  <div>
    <nav className="navbar navbar-default navbar-static-top">
            <div className="container">
              <div className="navbar-header">
                <img id="nasa-logo" src="NASA_logo.png"/>
                <Link to="/dashboard" className="navbar-brand">Farmate</Link>
              </div>
              <ul className="nav navbar-nav pull-right">
                <li>  
                  <span className="nav-button"><Link to="/about" className="navbar-brand">About</Link></span>
                  <span className="nav-button"><Link to="/dashboard" className="navbar-brand">Dashboard</Link></span> 
                   {this.state.authed
                    ? <span className="nav-button"><button
                        style={{border: 'none', background: 'transparent'}}
                        onClick={() => {
                          logout()
                        }}
                        className="navbar-brand">Logout</button></span>
                    : <span>
                        
                      </span>}
                </li>
              </ul>
            </div>
          </nav>
  </div>
      }
    return this.state.loading === true 
          ? <div id="loading">
            <img src="./images/nasa_spinner.gif" />
            <br />
            <span>The world is getting ready for you...</span>
          </div> 
          : (
      <BrowserRouter>
        <div>
          {browserRouter}
          <div className="container">
            <div className="row">
              <Switch>
                <Route path='/farmate' exact component={Login} />
                <PublicRoute authed={this.state.authed} path='/login' component={Login} />
                <PublicRoute authed={this.state.authed} path='/register' component={Register} />
                <PrivateRoute authed={this.state.authed} path='/dashboard' component={Dashboard} />
                <PrivateRoute authed={this.state.authed} path='/weather' component={Weather} />
                <PrivateRoute authed={this.state.authed} path='/newfield' component={NewField} />
                <Route path='/about' exact component={About} />
                <Route render={() => <Redirect to='/dashboard'/>}/>
              </Switch>
            </div>
          </div>
        </div>
      </BrowserRouter>
    );
  }
}
/*
class App extends Component {
  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h1 className="App-title">Wandrlove</h1>
        </header>
          <MapContainer></MapContainer>
      </div>
    );
  }
}

export default App;
*/