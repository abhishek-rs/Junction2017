import React, {Component} from 'react'
import './LoginComponent.css';

export default class Login extends Component {
    render( ){
        return(
           <div>
               <video className="background-video" loop muted autoPlay>
                    <source src="/frontend/images/video.mp4" type="video/mp4" />
                </video>
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
                     <button id="" type="submit" className="btn btn-success">Login</button>
                </form>
                 <h3>Login with Facebook</h3>
                 <button id="" type="submit" className="facebook">Continue with Facebook</button>
           </div>
        )
    }

}
