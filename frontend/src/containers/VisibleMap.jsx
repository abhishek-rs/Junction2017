import React, { Component } from 'react'
import { connect } from 'react-redux'
import * as userActions from "../actions/UserActions"
import MapComponent from "../components/Map/MapComponent"

const mapStateToProps = (state, ownProps) => {
  console.log(state.recommendations)
  return {
    recommendations: state.recommendations
  }
}

const mapDispatchToProps = (dispatch, ownProps) => {
  return {
  }
}

export default connect(mapStateToProps, mapDispatchToProps)(MapComponent);