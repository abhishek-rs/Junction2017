import React, {Component} from 'react'
import 'Login.css';

export default class Login extends Component {
    render( ){
        return(
           <div>
               <h1>
                 Explore your inner adverturer with our personalised reccommendations
               </h1>
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
                     <button id="buttonstyle" type="submit" className="btn btn-success">Login</button>
                </form>
                 <h3>Login with Facebook</h3>
                 <button id="" type="submit" className="Facebook">Continue with Facebook</button>
           </div>
        )
    }

}