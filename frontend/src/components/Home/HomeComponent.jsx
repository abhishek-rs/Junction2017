
import React, { Component } from 'react';
import MapComponent from '../Map/MapComponent';
import './HomeComponent.css';
import DatePick from '../DatePicker/DatePicker';
import moment from 'moment';
import Navbar from '../Navbar/Navbar';

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
