import * as types from '../constants/UserConstants';
import initialState from '../store/state';

const rootReducer = (state = initialState, action) => {
  switch (action.type) {

      case types.USER_RECOMMENDATIONS_REQUEST:
      return Object.assign({}, state, { requestInProgress: true });

    case types.USER_RECOMMENDATIONS_ERROR:
      return Object.assign({}, state, { requestInProgress: false });

    case types.USER_RECOMMENDATIONS_SUCCESS:
      return Object.assign({}, state, {
        requestInProgress: false,
        recommendations: action.response
      });

    case types.USER_INTEREST_TOGGLE:
      let newInterests = state.interests.slice()
      let indexOfInterest = state.interests.indexOf(action.interest)
      if (indexOfInterest !== -1) {
        newInterests.push(action.interest)
      } else {
        newInterests.splice(indexOfInterest, 1)
      }
      return Object.assign({}, state, {
        interests: newInterests
      });
  }
}

export default rootReducer;