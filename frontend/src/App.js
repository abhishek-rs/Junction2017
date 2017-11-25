import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import { Route, BrowserRouter, Link, Redirect, Switch } from 'react-router-dom'
import  HomeComponent  from './components/Home/HomeComponent'
import  LoginComponent  from './components/Login/LoginComponent'
import  RecommendationDetailComponent  from './components/RecommendationDetail/RecommendationDetailComponent'
import AppBar from 'material-ui/AppBar';
import Typography from 'material-ui/styles/typography';
import Toolbar from 'material-ui/Toolbar';
import RaisedButton from 'material-ui/RaisedButton';
import IconButton from 'material-ui/IconButton';
import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider';

const styles = theme => ({
  root: {
    marginTop: theme.spacing.unit * 3,
    width: '100%',
  },
  flex: {
    flex: 1,
  },
  menuButton: {
    marginLeft: -12,
    marginRight: 20,
  },
});

export default class App extends Component {
 
  render() {
    return <div id="app">
      <div id="top-bar">
        <h3>WandrLove</h3>
        <p>Powered by <img src="finnair.png"/></p>
      </div>
      <BrowserRouter>
        <Switch>
          <Route exact path='/' component={HomeComponent}/>
          <Route path='/login' component={LoginComponent}/>
          <Route path='/recommendation_detail/:number' component={RecommendationDetailComponent}/>
          <Route exact path='' component={HomeComponent}/>
        </Switch>
      </BrowserRouter>
    </div>
  }
}
