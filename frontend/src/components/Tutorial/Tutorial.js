import React from "react";
import {GridList, GridTile} from 'material-ui/GridList';
import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider';
import InterestCheckbox from './InterestCheckbox';
import { Link } from 'react-router-dom'
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
  }

  generateTiles = () => {
    let tiles = this.props.tilesData.map((tile) => (
        <GridTile
          key={tile.img}
          title={tile.title}
          actionPosition="left"
          actionIcon={
            <InterestCheckbox title={tile.title} onCheck={(tile) => {
              this.props.onInterestTileToggle(tile)}}/>
          }
          titlePosition="bottom"
          titleBackground="linear-gradient(to bottom, rgba(15,23,115,1) 0%,rgba(15,23,115,0.7) 70%,rgba(15,23,115,0.5) 100%)"
          className="tileStyle"
        >
          <img alt="" src={require('../../img/interests/' + tile.img)} />
        </GridTile>))
    return tiles;
  }

  render() {
    return(
      <div style={styles.root} className="themeFont">
        <div><img alt="logo" align="center" className="logo" src={require('../../img/logo.png')} /></div>
        <MuiThemeProvider>
        <div>
        <h1 align="center">Welcome to find your Dream Travel Destinations! </h1>
        <p align="center"> Select items that you appreciate while traveling from pictures below, so we will make sure you will get the deals you like!</p>
          <GridList
            cols={5}
            cellHeight={200}
            padding={1}
            style={styles.gridList}>
            {this.generateTiles()}
          </GridList>
          <div align="center">
            <button onClick={this.props.onLoginClick} className="raisedButton"><Link to="/dash">I'm ready to see my map!</Link></button>
          </div>
          </div>
      </MuiThemeProvider>

  </div>
    )}
  }
