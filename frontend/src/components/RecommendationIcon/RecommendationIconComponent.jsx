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
            type === 'event' ? <div className='pin music'></div> : ''
            }
            {
            type === 'sports' ? <div className='pin sports'></div> : ''
            }
            {
            type === 'likes' ? <div className='pin likes'></div> : ''
            }
            {
            type === 'visit' ? <div className='pin homes'></div> : ''
            }
            {
            type === 'place' || type == 'travel' ? <div className='pin travel'></div> : ''
            }
            <div className='pulse'></div>
        </div>
      );
  }
  }
