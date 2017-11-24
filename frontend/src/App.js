import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import { Route, BrowserRouter, Link, Redirect, Switch } from 'react-router-dom'
import  HomeComponent  from './components/Home/HomeComponent'
import  LoginComponent  from './components/Login/LoginComponent'
import  RecommendationDetailComponent  from './components/RecommendationDetail/RecommendationDetailComponent'

export default class App extends Component {

  render() {
    return <BrowserRouter>
      <Switch>
        <Route exact path='/' component={HomeComponent}/>
        <Route path='/login' component={LoginComponent}/>
        <Route path='/recommendation_detail/:number' component={RecommendationDetailComponent}/>
      </Switch>
    </BrowserRouter>
  }
}
