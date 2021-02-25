//Contact Component...Externally
import React from 'react';

//Contact Component....
const Contact=()=> {    

    //arrow Function

    const myaddress=()=>
    {
        return("this is javascript Function Statement Result...")
    }
   
    return(<>

               <div class="p">
                        { myaddress()   }
                        </div>
                <h1 class="p">CONTACT COMPONENT</h1>
                <p class="p">
                   Heree are the contact details off motivity labs

                   
                </p>
               

    

        </>);
}

export default Contact
