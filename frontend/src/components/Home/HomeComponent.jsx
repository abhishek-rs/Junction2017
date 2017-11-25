
import React, { Component } from 'react';    
import VisibleMap from '../../containers/VisibleMap';
import './HomeComponent.css';

export default class HomeComponent extends Component {
    render() {
      return (
        <div className="home"> 
           <VisibleMap />
        </div>
      );
    }
  }
