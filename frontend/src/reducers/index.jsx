import * as types from '../constants/UserConstants';
import initialState from '../store/state';

const rootReducer = (state = initialState, action) => {
  switch (action.type) {

      case types.USER_RECOMMENDATIONS_REQUEST:
      return Object.assign({}, state, { requestInProgress: true });

    case types.USER_RECOMMENDATIONS_ERROR:
      return Object.assign({}, state, { requestInProgress: false });

    case types.USER_RECOMMENDATIONS_SUCCESS:
      console.log(action.response)
      return Object.assign({}, state, {
        requestInProgress: false,
        recommendations: action.response
      });
  }
}

export default rootReducer;