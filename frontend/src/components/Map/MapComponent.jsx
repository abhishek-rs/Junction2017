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

const recommendations = [
  {
    id: 1,
    lat: 59.955413,
    long: 10.337844,
    activity: "Rock climbing",
    location: "California",
    type: recommendationTypes[0],
    categories: ['a','b'],
    images: ['nyc.jpg','nyc.jpg'],
    month: 3,
    price: 500,
    month: 'Jun'
  },
  {
    id: 2,
    location: "New York",
    lat: 71.955413,
    activity: "Rock climbing",
    long: 20.337844,
    type: recommendationTypes[1],
    categories: ['a','b'],
    images: ['nyc.jpg','nyc.jpg'],
    month: 4,
    price: 500,
    month: 'Jun'
  },
  {
    id: 3,
    lat: 59.955413,
    long: 30.337844,
    activity: "Rock climbing",
    location: "SunnyVale",
    type: recommendationTypes[2],
    categories: ['a','b'],
    images: ['nyc.jpg','nyc.jpg'],
    price: 500,
    month: 'Jun'
  },
  {
    id: 4,
    lat: 30.955413,
    long: 40.337844,
    activity: "Rock climbing",
    location: "Stockholm",
    type: recommendationTypes[3],
    categories: ['a','b'],
    images: ['nyc.jpg','nyc.jpg'],
    price: 500,
    month: 'Jun'
  },
  {
    id: 5,
    lat: 20.955413,
    long: 50.337844,
    activity: "Rock climbing",
    location: "Helsinki",
    type: recommendationTypes[4],
    categories: ['a','b'],
    images: ['nyc.jpg','nyc.jpg'],
    price: 500,
    month: 'Jun'
  },
]

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
    for (let r of this.props.recommendations){
      if(r.id !== id){
        recs.push(
          <RecommendationIconComponent
          lat={r.lat}
          lng={r.long}
          onIconClick={this.handleClick}
          type={r.type}
          key={r.id}
          id={r.id}
        />
        );
      }
    }
    if(id !== null){
      let r = this.props.recommendations.filter( r => r.id === id)[0];
      recs.push(
        <RecommendationCardComponent
        lat={r.lat}
        lng={r.long}
        rec={r}
        onCancelClick={this.handleClick}
        />
      );
    }
    this.setState({
      recs: recs
    });
  }

  componentDidMount() {
    console.log(this.props.recommendations)
    this.setState({
      recs: this.props.recommendations
    });
  }

  render() {
    console.log(this.props.recommendations)
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
          {this.state.recs !== [] ? this.state.recs: ""}
        </GoogleMapReact>
      </div>
    );
  }
}
