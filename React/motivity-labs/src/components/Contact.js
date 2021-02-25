//Contact Component...Externally
import React from 'react';

//Contact Component....
const Contact=()=> {    

    //arrow Function

    const myaddress=()=>
    {
        return("this is javascript Function Statement Result...")
    }

    return(<div className="App">
    <header className="App-header">

          { myaddress()   }

                <h1>CONTACT COMPONENT</h1>
                <p>
						www.react.com
					</p>
               
</header>
</div>
);
}

export default Contact
