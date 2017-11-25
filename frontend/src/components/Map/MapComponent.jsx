import React, { Component } from 'react';
import GoogleMapReact from 'google-map-react';
import './MapComponent.css';
const AnyReactComponent = ({ text }) => <div>{text}</div>;

export default class MapComponent extends Component {
  static defaultProps = {
    center: {lat: 59.95, lng: 30.33},
    zoom: 11
  };

  render() {
    return (
      <div id="map-container">
        <GoogleMapReact
          defaultCenter={this.props.center}
          defaultZoom={this.props.zoom}
        >
          <AnyReactComponent
            lat={59.955413}
            lng={30.337844}
            text={'SLUSH TOKYO'}
          />
        </GoogleMapReact>
      </div>
    );
  }
}
