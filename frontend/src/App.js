import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import MapContainer from './components/map';
import { GoogleApiWrapper } from 'google-maps-react';

class App extends Component {
  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h1 className="App-title">Wandrlove</h1>
        </header>
          <MapContainer></MapContainer>
      </div>
    );
  }
}

export default App;
