import React, { Component } from 'react';    
import MapComponent from '../Map/MapComponent';
import './HomeComponent.css';

export default class HomeComponent extends Component {
    render() {
      return (
        <div className="home"> 
           <MapComponent />
        </div>
      );
    }
  }