//Services Component...Externally

import React from 'react';

//Services Component
const Services=()=> {    

//Arrays
var myservices=["Web Application","Mobile Application","Content Writing","Web Application"]

    //JSX
    return(<>
                <h1 align="center" className="text-center">SERVICES COMPONENT</h1>   
                    
              <center>
               <ul align="center" className="list-group w-25" style={{color: "red"}}>
                    {
                        myservices.map( (result,index)=>  
                         <li className="list-group-item" key={index+1}> {index+1}.{ result } </li> )    
                    }
               </ul>
               </center>


    
              
        </>);
}

export default Services
