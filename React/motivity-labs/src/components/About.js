//About Component...Externally
import React from 'react';
import users from './json/userdata.json'

//import External CSS
import './css/aboutstyles.css';

//About Component
const About=()=> {    

const finalresult=users.map( (result,index)=>{        
     return(<ul key={index}>
                <li> {result.id} </li>
                <li> {result.name} </li>
                <li> {result.email} </li>
                <li> {result.phno} </li>
            </ul>)
})

    return(<div className="App">
    <header className="App-header">
                <h1 className="h1">ABOUT COMPONENT</h1>
                <p  className="p">
                    We are Learning React 
				</p>

                { finalresult }

        </header>
        </div>);
}

export default About
