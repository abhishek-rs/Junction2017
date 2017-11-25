import React from "react";
import {GridList, GridTile} from 'material-ui/GridList';
import IconButton from 'material-ui/IconButton';
import RaisedButton from 'material-ui/RaisedButton';
import Subheader from 'material-ui/Subheader';
import StarBorder from 'material-ui/svg-icons/toggle/star-border';
import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider'
import TutorialTile from './TutorialTile';
import InterestCheckbox from './InterestCheckbox';

const styles = {
  root: {
    display: 'flex',
    flexWrap: 'wrap',
    justifyContent: 'space-around'
  },
  gridList: {
    width: '90%',
    height: '100%',
    overflowY: 'auto',
    margin: 'auto'
  },
  raisedButton: {
    padding: '10px',
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
    img: 'ballet.jpeg',
    title: 'Performances',
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
  {
    img: 'surfing.jpeg',
    title: 'Surfing',
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

  updateInterests(e){
    console.log(e.target);
    console.log("interests updated");
    this.setState({interest_color: !this.state.interest_color})
  }

  render(){
    let bgColor = this.state.interest_color ? "red" : "white"
    return(
      <div style={styles.root}>
      <p>Welcome to Wandrlove! Select items that you appreciate when you are traveling from pictures below, so we will make sure you will get the deals you like!</p>
      <MuiThemeProvider>
      <div>
        <GridList
          cols={4}
          cellHeight={200}
          padding={1}
          style={styles.gridList}
        >
          {tilesData.map((tile) => (
            <GridTile
              key={tile.img}
              title={tile.title}
              actionPosition="left"
              actionIcon={<InterestCheckbox/>}
              titlePosition="bottom"
              titleBackground="linear-gradient(to bottom, rgba(0,0,0,0.7) 0%,rgba(0,0,0,0.3) 70%,rgba(0,0,0,0) 100%)"
            >
              <img style={styles.img} src={require('../../img/interests/' + tile.img)} />
            </GridTile>))}
        </GridList>
        <RaisedButton style={styles.raisedButton}>I'm happy with my choices, let's go</RaisedButton>
      </div>
    </MuiThemeProvider>
  </div>
    )}
  }
