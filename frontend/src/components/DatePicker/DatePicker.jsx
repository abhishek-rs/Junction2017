import React, { Component } from 'react';
import DayPicker from 'react-day-picker';
import 'react-day-picker/lib/style.css';
import './DatePicker.css';

export default class DatePick extends Component {
  render() {
    return (
      <div className = "top-wrapper">
        <div id="top-bar">
          <h3>WandrLove</h3>
          <p>Powered by <img src="finnair.png"/></p>
         <div className="white">
         <DayPicker selectedDays={new Date()} />
        </div>
        </div>
        </div>
    );
  }
}

