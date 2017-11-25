import React, { Component } from 'react';
import Tutorial from '../Tutorial/Tutorial.js';

export default class HomeComponent extends Component {
    render() {
      return (
        <div className="home">
            Map goes here!
            <Tutorial/>
        </div>
      );
    }
  }
