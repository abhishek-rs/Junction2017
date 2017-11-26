import { connect } from 'react-redux'
import * as userActions from "../actions/UserActions"
import Tutorial from "../components/Tutorial/Tutorial"

const mapStateToProps = (state, ownProps) => {
    console.log(state)
    return {
        interests: state.interests
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

const mergeProps = (stateProps, dispatchProps, ownProps) => {
    return {
        onGridLoginClick: () => {
            dispatchProps.onGridLoginClick(stateProps.interests)  
        },
        onInterestTileToggle: (interest) => {
            dispatchProps.onInterestTileToggle(interest)
        }
    }
}

const VisibleTutorial = connect(mapStateToProps, mapDispatchToProps, mergeProps)(Tutorial)

export default VisibleTutorial