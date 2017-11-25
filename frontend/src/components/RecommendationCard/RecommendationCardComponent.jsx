import React, { Component } from 'react';
import './RecommendationCardComponent.css';

export default class RecommendationCardComponent extends Component {
    constructor(props){
        super(props);
        this.handleClick = this.handleClick.bind(this);
    }

    handleClick(){
        this.props.onCancelClick(null);
    }

    render() {
      let rec = this.props.rec;
      let reasons = [];
      let images = [];
      for (let r of rec.categories){
          reasons.push(
              <div className="reasons">{r}</div>
          );
      }
      for (let image of rec.images){
          images.push(
            <img src={"https://adventuremap.mybluemix.net/images/" + image.toLowerCase()} />
        );
      }

      let URLLink="https://beta.finnair.com/fi-fi/booking/flight-selection?origin=HEL&destination=" + rec.iata + "&cabin=ECONOMY&adults=1&children=0&infants=0&departureDate=2018-01-02&returnDate=2018-02-01";
      
      return (

        <div className="rec-card">
            <div className="rec-head">{rec.location} <span><a className="closeBtn" onClick={this.handleClick}>X</a></span></div>
            <p>{rec.activity}</p>
            <div className="rec-images">{images}</div>
            <div>Estimated Price in <span className="month">{rec.month}</span></div>
            <div className="rec-price"> &euro; {rec.price}</div>
            <span><a className="see-more" href={URLLink}>Book now</a></span>
        </div>
      );
    }
  }
