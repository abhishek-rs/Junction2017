import React from "react";
import {GridList, GridTile} from 'material-ui/GridList';
import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider'
import InterestCheckbox from './InterestCheckbox';
import PropTypes from 'prop-types';
import { withStyles } from 'material-ui/styles';
import RaisedButton from 'material-ui/RaisedButton';
import './Tutorial.css';

const styles = {
  root: {
    display: 'flex',
    flexWrap: 'wrap',
    justifyContent: 'space-around',
    width: '80%',
    margin: 'auto',
    align:'center',
  },
  gridList: {
    width: '100%',
    height: '100%',
    overflowY: 'auto',
    padding: 0,
  },
  selected: {
    backgroundColor: 'green'
  }
};

const tilesData = [
  {
    img: 'beach.jpeg',
    title: 'Beach',
  },
  {
    img: 'zoo.jpeg',
    title: 'Zoo',
  },
  {
    img: 'bar.jpg',
    title: 'Bar',
  },
  {
    img: 'beer.jpg',
    title: 'Craft Beer',
  },
  {
    img: 'children.jpeg',
    title: 'Child-friendly',
  },
  {
    img: 'city.jpeg',
    title: 'City',
  },
  {
    img: 'fastfood.jpeg',
    title: 'Street Food',
  },
  {
    img: 'forest.jpeg',
    title: 'Nature',
  },
  {
    img: 'gig.jpeg',
    title: 'Music events',
  },
  {
    img: 'mountain.jpeg',
    title: 'Mountains',
  },
  {
    img: 'finedining.jpeg',
    title: 'Fine dining',
  },
  {
    img: 'surfing.jpeg',
    title: 'Surfing',
  },
  {
    img: 'museum.jpeg',
    title: 'Museum',
  },
  {
    img: 'romantic.jpeg',
    title: 'Romantic',
  },
  {
    img: 'sports.jpeg',
    title: 'Sports',
  },
];


export default class Tutorial extends React.Component {
  constructor(props){
    super(props);
    this.interests = [];
    this.state = {
       interest_color: true
    }
    this.updateInterests = this.updateInterests.bind(this);
  }

  updateInterests(tile){
    console.log(tile);
    console.log("interests updated");
  }

  render(){
    return(
      <div style={styles.root} className="themeFont">
      <img className="logo" src={require('../../img/logo.png')} />
      <p className="themeFont">Welcome to Wandrlove! Select items that you appreciate when you are traveling from pictures below, so we will make sure you will get the deals you like!</p>
      <MuiThemeProvider>
      <div>
        <GridList
          cols={5}
          cellHeight={200}
          padding={1}
          style={styles.gridList}
        >
          {tilesData.map((tile) => (
            <GridTile
              key={tile.img}
              title={tile.title}
              actionPosition="left"
              actionIcon={
                <InterestCheckbox onClick={this.updateInterests()}/>
              }
              titlePosition="bottom"
              titleBackground="linear-gradient(to bottom, rgba(15,23,115,1) 0%,rgba(15,23,115,0.7) 70%,rgba(15,23,115,0.5) 100%)"
              className="tileStyle"
            >
              <img src={require('../../img/interests/' + tile.img)} />
            </GridTile>))}
        </GridList>
        <button className="raisedButton">I'm ready to see my map!</button>
        </div>
    </MuiThemeProvider>
  </div>
    )}
  }
