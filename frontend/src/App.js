import React, { Component } from 'react';
import './App.css';
import { Route, BrowserRouter, Switch } from 'react-router-dom'
import  HomeComponent  from './components/Home/HomeComponent'
import  LoginComponent  from './components/Login/LoginComponent'
import  RecommendationDetailComponent  from './components/RecommendationDetail/RecommendationDetailComponent'
import Tutorial from './components/Tutorial/Tutorial';

export default class App extends Component {

  render() {
    return <div id="app">
      <BrowserRouter>
        <Switch>
          <Route exact path='/' component={HomeComponent}/>
          <Route path='/login' component={LoginComponent}/>
          <Route path='/tutorial' component={Tutorial}/>
          <Route path='/recommendation_detail/:number' component={RecommendationDetailComponent}/>
          <Route exact path='' component={HomeComponent}/>
        </Switch>
      </BrowserRouter>
    </div>
  }
}
