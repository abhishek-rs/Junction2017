import React, { Component } from 'react';
import GoogleMapReact from 'google-map-react';
import './MapComponent.css';
import RecommendationIconComponent from '../RecommendationIcon/RecommendationIconComponent'
import RecommendationCardComponent from '../RecommendationCard/RecommendationCardComponent'
import LeftBar from '../LeftBar/LeftBar'
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
      card: null,
      month: 0
    })
    this.handleClick = this.handleClick.bind(this);
    this.handleCancel = this.handleCancel.bind(this);
    this.swapIcon = this.swapIcon.bind(this);
    this.returnIcon = this.returnIcon.bind(this);
    this.renderIcons = this.renderIcons.bind(this);
    this.handleMonth = this.handleMonth.bind(this);
  }

  handleClick(id){
    this.swapIcon(id);
  }

  handleCancel(id){
    this.returnIcon(id);
  }

  swapIcon(id){
    let currentIconState = this.state.recommendations;
    let card = this.state.recommendations.filter( r => r.id === id)[0];
    let prevCard = this.state.card;
    if(prevCard != null){
      currentIconState.push(prevCard);
    }
    let index = currentIconState.indexOf(card);
    currentIconState.splice(index, 1);
    this.setState({
      icons: currentIconState,
      card: card
    });  
  }

returnIcon(r){
    let currentIconState = this.state.recommendations;
    let card = null;
    currentIconState.push(this.state.card);
    this.setState({
      icons: currentIconState,
      card: card
    });    
  }

  handleMonth(value){
    let icons = [];
    if(value == 0) {
      this.renderIcons();
    }
    else{
      for (let r of this.state.recommendations){
        if(r.month == value){  
          icons.push(
            r
          );
        }
      }
  
      this.setState({
        icons: icons
      });
    }

  }

  renderIcons(){
    let icons = this.state.icons;
    for (let r of this.state.recommendations){
      
        icons.push(
          r
        );
      
    }
    this.setState({
      icons: icons
    });
  }
  /*
  reRenderIcons(id){
    let icons = this.state.icons;
    let card = this.state.card;
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
  */
  componentWillReceiveProps(nextProps) {
    console.log(nextProps);
    if(nextProps){
      this.setState({
        recommendations: nextProps.recommendations
      }, () => this.renderIcons());
    }
  }

  render() {
    let recs = [];
    console.log(this.state.month);
    console.log(this.state.icons);
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
        onCancelClick={this.handleCancel}
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
        <LeftBar month={this.state.month} handleMonth={this.handleMonth}/>
      </div>
    );
  }
}
