import React from 'react';
import GridTile from 'material-ui/GridList';
import IconButton from 'material-ui/IconButton';
import RaisedButton from 'material-ui/RaisedButton';
import Subheader from 'material-ui/Subheader';
import StarBorder from 'material-ui/svg-icons/toggle/star-border';

const styles = {
  img: {
    width: '300px',
    height: '200px',
    zIndex: '-1',
    position:'absolute'
  }
}

export default class TutorialTile extends React.Component {
  constructor(props){
    super(props);
    this.state = {
       interest_color: true
    }
    console.log(this.props.img);
    console.log(this.props.title);
    this.img = this.props.img;
    this.title = this.props.title;
    this.updateInterests = this.updateInterests.bind(this);
  }

  updateInterests(){
    console.log("interests updated");
    this.setState({interest_color: !this.state.interest_color})
  }

  render(){
      let bgColor = this.state.interest_color ? "red" : "white"

    return(
    <GridTile
      key={this.img}
      title={this.title}
      actionIcon={<IconButton style={{backgroundColor: bgColor}} onClick={this.updateInterests.bind(this)}><StarBorder color="white" /></IconButton>}
      actionPosition="left"
      titlePosition="bottom"
      titleBackground="linear-gradient(to bottom, rgba(0,0,0,0.7) 0%,rgba(0,0,0,0.3) 70%,rgba(0,0,0,0) 100%)"
    >
      <img style={styles.img} src={require('../../img/interests/' + this.img)} />
    </GridTile>
  )
  }
}
