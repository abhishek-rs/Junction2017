
import React, { Component } from 'react';
import MapComponent from '../Map/MapComponent';
import DatePick from '../DatePicker/DatePicker';
import moment from 'moment';
import './HomeComponent.css';

export default class HomeComponent extends Component {
    render() {
      return (
        <div className="home">
           <MapComponent />
           <DatePick />
        </div>
      );
    }
  }
