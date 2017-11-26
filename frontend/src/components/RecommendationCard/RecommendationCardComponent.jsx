import React, { Component } from 'react';
import './RecommendationCardComponent.css';
import Checkbox from 'material-ui/Checkbox';
import ActionFavorite from 'material-ui/svg-icons/action/favorite';
import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider';
import ActionFavoriteOutline from 'material-ui/svg-icons/action/favorite-border';
import ActionDislikeOutline from 'material-ui/svg-icons/content/clear';
import ActionDislike from 'material-ui/svg-icons/action/delete-forever';

const styles = {
  block: {
    maxWidth: 250,
  },
  checkbox: {
    fontSize: "0.9em",
  },
};

const months = {
    1: 'January',
    2: 'February',
    3: 'March',
    4: 'April',
    5: 'May',
    6: 'June',
    7: 'July',
    8: 'August',
    9: 'September',
    10: 'October',
    11: 'November',
    12: 'December'
}

export default class RecommendationCardComponent extends Component {
    constructor(props){
        super(props);
        this.handleClick = this.handleClick.bind(this);
        this.deleteRecommendation = this.deleteRecommendation.bind(this);
    }

    handleClick(){
        this.props.onCancelClick(this.props.rec);
    }

    deleteRecommendation(hello){
      console.log(hello);
    }

    render() {
      let rec = this.props.rec;
      let reasons = [];
      let images = [];

      for (let image of rec.images){
          images.push(
            <img src={"https://adventuremap.mybluemix.net/images/" + image.toLowerCase()} />
        );
      }

      let URLLink="https://beta.finnair.com/fi-fi/booking/flight-selection?origin=HEL&destination=" + rec.iata + "&cabin=ECONOMY&adults=1&children=0&infants=0&departureDate=2018-01-02&returnDate=2018-01-15";

      return (

        <div className="rec-card">
            <div className="rec-head">{rec.location} <span><a className="closeBtn" onClick={this.handleClick}>X</a></span></div>
            <p>{rec.activity}</p>
            <div className="rec-images">{images}</div>
            <div>Flights in <span className="month">{months[rec.month]}</span></div>
            <div className="rec-price"> &euro; {rec.price}</div>
            <span><a target="_blank" className="see-more" href={URLLink}>Book now</a></span>
            <MuiThemeProvider>
            <div className="favorite">
              <Checkbox
                checkedIcon={<ActionFavorite />}
                uncheckedIcon={<ActionFavoriteOutline />}
                label="Add to Bucket List"
                style={styles.checkbox}
                labelStyle={{color: 'grey', fontFamily: 'Raleway'}} iconStyle={{fill: '#0d1973'}}
                />
                <Checkbox
                  checkedIcon={<ActionDislike/>}
                  uncheckedIcon={<ActionDislikeOutline />}
                  style={styles.checkbox}
                  labelStyle={{color: 'grey', fontFamily: 'Raleway'}} iconStyle={{fill: '#0d1973'}}
                  label="This is not for me"
                  onClick={this.deleteRecommendation}
                  />
            </div>
            <div class="fb-share-button" data-href="https://adventuremap-frontend.mybluemix.net/" data-layout="button" data-size="small" data-mobile-iframe="false"><a class="fb-xfbml-parse-ignore" target="_blank" href="https://www.facebook.com/sharer/sharer.php?u=https%3A%2F%2Fadventuremap-frontend.mybluemix.net%2F&amp;src=sdkpreparse"><img alt="fb" className="btnIcon" src={require("../../img/fb.png")}/>Share</a></div>
          </MuiThemeProvider>
        </div>
      );
    }
  }
