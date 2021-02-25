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

    return(<>
                <h1 className="h1">ABOUT COMPONENT</h1>
                <h1 className="p">
                   This is my about page 
                    </h1>

              <center>  { finalresult }</center>

        </>);
}

export default About
