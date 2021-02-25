//Services Component...Externally

import React from 'react';

//Services Component
const Services=()=> {    

//Arrays
var myservices=["Web Application","Mobile Application","Content Writing","Web Application"]

    //JSX
    return( <div className="App">
    <header className="App-header">
                <h1 className="text-center">SERVICES COMPONENT</h1>
                
                <p>
                   React offers many services
				   </p>

               <ul className="list-group w-25">
                    {
                        myservices.map( (result,index)=>   <li className="list-group-item" key={index+1}> {index+1}.{ result } </li> )    
                    }
               </ul>

              
       </header>
       </div>
       );
}

export default Services
