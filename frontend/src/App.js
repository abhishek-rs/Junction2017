import React, { Component } from 'react';
import './App.css';
import { Route, BrowserRouter, Switch } from 'react-router-dom'
import  HomeComponent  from './components/Home/HomeComponent'
import  VisibleLogin  from './containers/VisibleLogin'
import  RecommendationDetailComponent  from './components/RecommendationDetail/RecommendationDetailComponent'
import Tutorial from './components/Tutorial/Tutorial';

export default class App extends Component {

  render() {
    return <div id="app">
      <BrowserRouter>
        <Switch>
          <Route exact path='/dash' component={HomeComponent}/>
          <Route path='/' component={VisibleLogin}/>
          <Route path='/tutorial' component={Tutorial}/>
          <Route path='/recommendation_detail/:number' component={RecommendationDetailComponent}/>
          <Route exact path='.' component={VisibleLogin}/>
        </Switch>
      </BrowserRouter>
  </div>
  }
}
