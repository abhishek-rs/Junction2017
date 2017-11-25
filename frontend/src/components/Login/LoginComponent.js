import React, {Component} from 'react'
import './LoginComponent.css';

export default class Login extends Component {
    render( ){
        return(
           <div className="login-wrapper">
               <video className="background-video" loop muted autoPlay>
                    <source src="video.mp4" type="video/mp4" />
                </video>
                <div className = "welcome-div" >
                <div className ="border" >
                <h1 className = "app-title">Wandrlove</h1>
               <h2>
                 Explore your inner adverturer with our personalised reccommendations
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
                     <button id="" type="submit" className="login-button">Login</button>
                </form>
                 <button id="" type="submit" className="facebook">Continue with Facebook</button>
            </div>
           </div>
           </div>
        )
    }

}
