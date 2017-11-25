import React, { Component } from 'react';
import './App.css';
import { Route, BrowserRouter, Switch } from 'react-router-dom'
import  HomeComponent  from './components/Home/HomeComponent'
import  VisibleLogin  from './containers/VisibleLogin'
import  RecommendationDetailComponent  from './components/RecommendationDetail/RecommendationDetailComponent'
import VisibleTutorial from './containers/VisibleTutorial';

export default class App extends Component {

  render() {
    return <div id="app">
      <BrowserRouter>
        <div>
          <Route exact path='/dash' component={HomeComponent}/>
          <Route exact path='/' component={VisibleLogin}/>
          <Route exact path='/tutorial' component={VisibleTutorial}/>
          <Route exact path='/recommendation_detail/:number' component={RecommendationDetailComponent}/>
          <Route exact path='.' component={VisibleLogin}/>
        </div>
      </BrowserRouter>
    </div>
  }
}
