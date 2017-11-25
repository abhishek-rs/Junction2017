import { connect } from 'react-redux'
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

const VisibleMap = connect(mapStateToProps, mapDispatchToProps)(MapComponent)

export default VisibleMap