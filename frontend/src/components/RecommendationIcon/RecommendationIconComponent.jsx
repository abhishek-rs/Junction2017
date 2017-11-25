import React, { Component } from 'react';    
import './RecommendationIconComponent.css';

export default class RecommendationIconComponent extends Component {
    constructor(props){
        super(props);
    }
    
    render() {
      let type = this.props.type;  
      return (
        <div className="rec-icon">
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