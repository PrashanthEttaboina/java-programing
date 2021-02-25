//Home Component...Externally
import React from 'react';


//Home Component [parent Component]
const Home=()=> { 
    
    //variable
    var name="Prashanth",email="Prashanth@gmail.com"


    //variable_type_obeject_styles
    const variable={
        letterSpacing:'1px',
        wordSpacing:'1px',
        fontSize:'17px',
        color:'green',
        lineheight:'160%',
        'text-align':'justify',
        'border-style':'double'
    }
    

    return(<React.Fragment>
            <div className="container py-5">
              <h1>HOME COMPONENT</h1>
                <h5>Hii My name is : </h5>{name}
               <h5>My Email id is : </h5>{email}
                </div>
    </React.Fragment>);
}

export default Home
