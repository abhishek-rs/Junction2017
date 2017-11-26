import { connect } from 'react-redux'
import * as userActions from "../actions/UserActions"
import Tutorial from "../components/Tutorial/Tutorial"
import React from "react";
import InterestCheckbox from '../components/Tutorial/InterestCheckbox';
import {GridList, GridTile} from 'material-ui/GridList';

const mapStateToProps = (state, ownProps) => {
    console.log(state)
    return {
        interests: state.interests,
        tilesData: state.tilesData
    }
}

const mapDispatchToProps = (dispatch, ownProps) => {
  return {
    onGridLoginClick: (interests) => {
        dispatch(userActions.userRecommendationsGrid(interests))
    },
    onInterestTileToggle: (interest) => {
        dispatch(userActions.userInterestToggle(interest))
    }
  }
}

const mergeProps = (stateProps, dispatchProps) => {
    return {
        ...stateProps,
        ...dispatchProps,
        onLoginClick: (event) => {
            console.log(stateProps.interests)
            dispatchProps.onGridLoginClick(stateProps.interests)
        }
    }
}

const VisibleTutorial = connect(mapStateToProps, mapDispatchToProps, mergeProps)(Tutorial)

export default VisibleTutorial