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
                       <Link to="/Tutorial">
                      <button type="button" className="loginButton">
                          Login
                      </button>
                  </Link>
                  <div id="fb-root"></div>
                    <Link to="/"><div className="fb-login-button" data-max-rows="1" data-size="large" data-button-type="login_with" data-show-faces="false" data-auto-logout-link="false" data-use-continue-as="false"></div></Link>
                </form>
              </div>
          </div>
          </div>
        )
    }

}
