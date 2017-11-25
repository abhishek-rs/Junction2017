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
            <div className="rec-head">{rec.activity} at {rec.location}</div>
            <div className="month">In the month of {rec.month}</div>
            <div className="why"><p>Why are we sending you here?</p> {reasons}</div>     
            <div className="rec-images">{images}</div>
            <div className="rec-price">&euro; {rec.price}</div>
            <span><a className="see-more" href="/">See more</a></span>
            <span><a className="see-more cancel" onClick={this.handleClick}>Cancel</a></span>
        </div>
      );
    }
  }