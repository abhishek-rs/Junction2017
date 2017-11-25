import React, { Component } from 'react';
import './RecommendationIconComponent.css';

export default class RecommendationIconComponent extends Component {
    constructor(props){
        super(props);
        this.handleClick = this.handleClick.bind(this);
    }

    handleClick(){
        this.props.onIconClick(this.props.id);
    }

    render() {
      let type = this.props.type;

    return (
        <div className="rec-icon" onClick={this.handleClick}>
            {
            type === 'music' ? <div className='pin music'></div> : ''
            }
            {
            type === 'sport' ? <div className='pin sports'></div> : ''
            }
            {
            type === 'likes' ? <div className='pin likes'></div> : ''
            }
            {
            type === 'home' ? <div className='pin homes'></div> : ''
            }
            {
            type === 'travel' ? <div className='pin travel'></div> : ''
            }
            <div className='pulse'></div>
        </div>
      );
  }
  }
