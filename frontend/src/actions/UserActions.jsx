import * as types from '../constants/UserConstants'

/** Airports retrieval handling. */
export function userRecommendationsRequest() {
  return { type: types.USER_RECOMMENDATIONS_REQUEST }
}

export function userRecommendationsSuccess(response) {
    return { type: types.USER_RECOMMENDATIONS_SUCCESS, response }
}

export function userRecommendationsError() {
    return { type: types.USER_RECOMMENDATIONS_ERROR }
}

export function userRecommendationsGrid(request) {
  console.log(request)
  return dispatch => {
    dispatch(userRecommendationsRequest());

    fetch("https://adventuremap.mybluemix.net/api/recommendations/grid", {
      headers: {
        'Content-Type': 'application/json'
      },
      method: "POST",
      body: JSON.stringify({'categories' : request})
    }).then((response) => {
      if (response.status >= 200 && response.status < 300) {
        return response.json();
      } else {
        const error = new Error(response.statusText);
        error.response = response;
        dispatch(userRecommendationsError(error));
        throw error;
      }
    }).then((responseData) => {
      dispatch(userRecommendationsSuccess(responseData));
    })
  }
}

export function userRecommendationsFb() {
  return dispatch => {
    dispatch(userRecommendationsRequest());

    fetch("https://adventuremap.mybluemix.net/api/recommendations/fb", {
      headers: {
        'Content-Type': 'application/json'
      },
      method: "GET"
    }).then((response) => {
      if (response.status >= 200 && response.status < 300) {
        return response.json();
      } else {
        const error = new Error(response.statusText);
        error.response = response;
        dispatch(userRecommendationsError(error));
        throw error;
      }
    }).then((responseData) => {
      dispatch(userRecommendationsSuccess(responseData));
    })
  }
}

export function userInterestToggle(interest) {
  return { type: types.USER_INTEREST_TOGGLE, interest }
}

/** End of user recommendations handling. */
