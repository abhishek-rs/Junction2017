import React, { Component } from 'react'
import { connect } from 'react-redux'
import * as userActions from "../actions/UserActions"
import Login from "../components/Login/LoginComponent"

const mapStateToProps = (state) => {
  return {
  }
}

const mapDispatchToProps = (dispatch, ownProps) => {
  return {
    onFbLoginClick: () => {
      dispatch(userActions.userRecommendationsFb())
    }
  }
}

export default connect(mapStateToProps, mapDispatchToProps)(Login);