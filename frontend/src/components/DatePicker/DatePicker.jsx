import React, { Component } from 'react';
import DayPicker from 'react-day-picker';
import 'react-day-picker/lib/style.css';
import './DatePicker.css';

export default class DatePick extends Component {
  render() {
    return (
      <div className="top-wrapper">
        <div id="top-bar">
        <div><img alt="logo" align="center" className="panelLogo" src={require('../../img/logo.png')} /></div>
          <p>Powered by <img className="finnair" src="finnair.png"/></p>
         <DayPicker selectedDays={new Date()} />
         <div className="stats">
          <div className="statTile">
          <h1>21</h1>
            <p>Countries visited</p>
            </div>
              <div className="statTile">
          <h1>3122</h1>
          <p>Adventure points</p>
            </div>
         </div>
        </div>
        </div>
    );
  }
}
