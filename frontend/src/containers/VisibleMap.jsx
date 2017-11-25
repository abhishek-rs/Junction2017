import React, { Component } from 'react'
import { connect } from 'react-redux'
import * as userActions from "../actions/UserActions"
import Map from "../components/Map/MapComponent"

const mapStateToProps = (state, ownProps) => {
  return {
    recommendations: state.recommendations
  }
}

const mapDispatchToProps = (dispatch, ownProps) => {
  return {
  }
}

export default connect(mapStateToProps, mapDispatchToProps)(Login);