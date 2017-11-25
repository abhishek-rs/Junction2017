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
      icons: [],
      recommendations: [],
      card: null
    })
    this.handleClick = this.handleClick.bind(this);
    this.reRenderIcons = this.reRenderIcons.bind(this);
  }

  handleClick(id){
    console.log(id);
    this.reRenderIcons(id);
  }

  reRenderIcons(id){
    let icons = [];
    let card = null;
    console.log(this.state.recommendations);
    for (let r of this.state.recommendations){
      if(r.id !== id){
        icons.push(
          r
        );
      }
    }
    if(id !== null){
      card = this.state.recommendations.filter( r => r.id === id)[0];
    }
    this.setState({
      icons: icons,
      card: card
    });
  }

  componentWillReceiveProps(nextProps) {
    console.log(nextProps);
    if(nextProps){
      this.setState({
        recommendations: nextProps.recommendations
      }, () => this.reRenderIcons(null));
    }
  }

  render() {
    let recs = [];
    for (let r of this.state.icons){
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
    if( this.state.card != null){
      recs.push(
        <RecommendationCardComponent
        lat={this.state.card.lat}
        lng={this.state.card.lon}
        onCancelClick={this.handleClick}
        type={this.state.card.type}
        key={this.state.card.id}
        id={this.state.card.id}
        rec={this.state.card}
      />
      );
    }

    return (
      <div id="map-container">
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
