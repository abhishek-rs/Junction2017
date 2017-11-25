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
            <img src={image} />
        );
      }
      return (
        <div className="rec-card">
            <div className="rec-head">{rec.location} <span><a className="closeBtn" onClick={this.handleClick}>X</a></span></div>
            <p>{rec.activity}</p>
            <div className="rec-images">{images}</div>
            <div>Estimated Price in <span className="month">{rec.month}</span></div>
            <div className="rec-price"> &euro; {rec.price}</div>
            <span><a className="see-more" href="https://www.finnair.com/fi/gb/bookings">Book now</a></span>
        </div>
      );
    }
  }
