import React from "react";
import {Map, InfoWindow, Marker, GoogleApiWrapper} from 'google-maps-react';

const style = {
  width: '200px',
  height: '200px',
}

export default class MapContainer extends React.Component {

  render() {
    return (
      <Map
        google={this.props.google}
        zoom={14}
        style={style}
        visible={true}
        >

        <Marker onClick={this.onMarkerClick}
                name={'Current location'} />

        <InfoWindow onClose={this.onInfoWindowClose}>
            <div>
              <h1>Hello</h1>
            </div>
        </InfoWindow>
      </Map>
    );
  }
}
