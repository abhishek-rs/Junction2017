import React, { Component } from 'react';
import GoogleMapReact from 'google-map-react';
import './MapComponent.css';
import RecommendationIconComponent from '../RecommendationIcon/RecommendationIconComponent'

const AnyReactComponent = ({ text }) => <div>{text}</div>;
const recommendationTypes = [
  'likes', 'sport', 'home', 'travel', 'music'
];

export default class MapComponent extends Component {
  static defaultProps = {
    center: {lat: 59.95, lng: 30.33},
    zoom: 11
  };

  render() {
    
    return (
      <div id="map-container">
      <div id="top-bar">
        <h3>WandrLove</h3>
        <p>Powered by <img src="finnair.png"/></p>
      </div>
        <GoogleMapReact
          defaultCenter={this.props.center}
          defaultZoom={this.props.zoom}
        >
          <RecommendationIconComponent
            lat={59.955413}
            lng={20.337844}
            type={recommendationTypes[0]}
          />
          <RecommendationIconComponent
            lat={59.955413}
            lng={30.337844}
            type={recommendationTypes[1]}
          />
          <RecommendationIconComponent
            lat={59.955413}
            lng={10.337844}
            type={recommendationTypes[2]}
          />
          <RecommendationIconComponent
            lat={59.955413}
            lng={40.337844}
            type={recommendationTypes[3]}
          />
          <RecommendationIconComponent
            lat={59.955413}
            lng={50.337844}
            type={recommendationTypes[4]}
          />
        </GoogleMapReact>
      </div>
    );
  }
}
