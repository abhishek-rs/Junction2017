
import React, { Component } from 'react';    
import VisibleMap from '../../containers/VisibleMap';
import './HomeComponent.css';
import DatePick from '../DatePicker/DatePicker';
import moment from 'moment';


export default class HomeComponent extends Component {
    render() {
      return (
        <div className="home"> 
           <VisibleMap />
           <DatePick />
        </div>
      );
    }
  }
