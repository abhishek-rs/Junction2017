import React, { Component } from 'react';
import GoogleMapReact from 'google-map-react';
import './MapComponent.css';
import RecommendationIconComponent from '../RecommendationIcon/RecommendationIconComponent'
import RecommendationCardComponent from '../RecommendationCard/RecommendationCardComponent'
const recommendationTypes = [
  'likes', 'sport', 'home', 'travel', 'music'
];

const defaultZoom = 2;
const defaultCenter = {lat: 37.9908164, lng: 23.6682993};

export default class MapComponent extends Component {
  constructor(props){
    super(props);
    this.state = Object.assign({
      openRecId: null,
      recs: []
    })
    this.handleClick = this.handleClick.bind(this);
    this.reRenderIcons = this.reRenderIcons.bind(this);
  }

  handleClick(id){
    console.log(id);
    this.reRenderIcons(id);
  }

  reRenderIcons(id){
    let recs = [];
    for (let r of this.state.recs){
      if(r.id !== id){
        recs.push(
          <RecommendationIconComponent
          lat={r.lat}
          lng={r.lon}
          onIconClick={this.handleClick}
          type={r.type}
          key={r.id}
          id={r.id}
        />
        );
      }
    }
    if(id !== null){
      let r = this.state.recs.filter( r => r.id === id)[0];
      
      recs.push(
        <RecommendationCardComponent
        lat={r.lat}
        lng={r.lon}
        rec={r}
        onCancelClick={this.handleClick}
        />
      );
    }
    this.setState({
      recs: recs
    });
  }

  componentWillReceiveProps(nextProps) {
    if(nextProps){
      this.setState({
        recs: nextProps.recommendations
      }, this.reRenderIcons(null));
    }
  }

  render() {
    let recs = [];
    for (let r of this.state.recs){
        recs.push(
          <RecommendationIconComponent
          lat={r.lat}
          lng={r.lon}
          onIconClick={this.handleClick}
          type={r.type}
          key={r.id}
          id={r.id}
        />
        );
    }
    return (
      <div id="map-container">
      <div id="top-bar">
        <h3>WandrLove</h3>
        <p>Powered by <img src="finnair.png" alt="finnair"/></p>
      </div>
        <GoogleMapReact
          defaultCenter={defaultCenter}
          defaultZoom={3}
        >
          {recs !== [] ? recs : ""}
        </GoogleMapReact>
      </div>
    );
  }
}
