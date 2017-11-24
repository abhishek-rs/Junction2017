import React, {Component} from 'react'
import 'Login.css';

export default class Login extends Component {
    render( ){
        return(
           <div>
           <h1>Explore your inner adverturer with our personalised reccommendations</h1>
           <h3>Login with email</h3>
           <div className="form-group">
            <input className="form-control" placeholder="Email"/>
          </div>
          <div className="form-group">
            <input type="password" className="form-control" placeholder="Password" />
          </div>
           <h3>Login with Facebook</h3>
           </div>
        )
    }

}