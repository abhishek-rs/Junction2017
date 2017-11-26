import React, {Component} from 'react'
import './LoginComponent.css';
import { Link } from 'react-router-dom'

export default class Login extends Component {
    render( ){
        return(
           <div className="login-wrapper">
               <video className="background-video" loop muted autoPlay>
                    <source src="video.mp4" type="video/mp4" />
                </video>
                <div className = "welcome-div" >
                <div className ="border">
                  <img className="logo" alt="logo" src={require('../../img/logo.png')} />
                 <h2>
                   Explore your inner adventurer with personalised recommendations
                 </h2>
                  <h3>
                   Login with email
                  </h3>
                  <form>
                      <div className="form-group">
                          <input className="form-control" placeholder="Email"/>
                      </div>
                       <div className="form-group">
                          <input type="password" className="form-control" placeholder="Password" />
                       </div>
                       <Link to="/tutorial">
                      <button type="button" className="loginButton">
                          Login
                      </button>
                  </Link>
                  <div>
                  <Link to="/dash">
                        <button onClick={this.props.onFbLoginClick} className="facebook"><img alt="fb" className="btnIcon" src={require("../../img/fb.png")}/><span>Login with Facebook</span></button>
                  </Link>
                  </div>
                </form>
              </div>
          </div>
          </div>
        )
    }

}
