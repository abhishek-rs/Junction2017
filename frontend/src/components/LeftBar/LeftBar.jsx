import React, { Component } from 'react';
import DayPicker from 'react-day-picker';
import 'react-day-picker/lib/style.css';
import './LeftBar.css';
import Slider from 'react-rangeslider'
import 'react-rangeslider/lib/index.css'

const labels = {
  0: 'All',
  4: 'April',
  8: 'Aug',
  12: 'Dec'
}

const months = {
  0: 'All',
  1: 'Jan',
  2: 'Feb',
  3: 'Mar',
  4: 'Apr',
  5: 'May',
  6: 'Jun',
  7: 'Jul',
  8: 'Aug',
  9: 'Sep',
  10: 'Oct',
  11: 'Nov',
  12: 'Dec'
}

export default class LeftBar extends Component {
  constructor(props){
    super(props);
    this.state = Object.assign({
      value: props.month,
      min: 0,
      max: 12,
      label: 'All'
    })
    this.handleChange = this.handleChange.bind(this);
  }

  handleChange(value){
    this.setState({
      value: value,
      label: months[value]
    })
    this.props.handleMonth(value);
  }

  render() {
    return (
      <div className="top-wrapper">
        <div id="top-bar">
          <div><img alt="logo" align="center" className="panelLogo" src={require('../../img/logo.png')} /></div>
          <p>Powered by <img className="finnair" src="finnair.png"/></p>

          <div className="month-slider">
            <Slider
              min={0}
              max={12}
              value={this.state.value}
              labels={labels}
              handleLabel={this.state.label}
              onChange={this.handleChange}
            />
          </div>
          <div className="stats">
            <div className="statTile">
              <h1>21</h1>
              <p>Countries visited</p>
            </div>
            <div className="statTile">
              <h1>3122</h1>
              <p>Adventure points</p>
            </div>
            <div className="statTile">
              <h1>12</h1>
              <p>Places on Bucket List</p>
            </div>
          </div>
        </div>
      </div>
      
    );
  }
}
