//Home Component...Externally
import React from 'react';

//Home Component [parent Component]
const Home=()=> { 
    
    //variable
    var id=1001,name="kumar",email="kumar@gmail.com"


    //variable_type_obeject_styles
    // const variable={
    //     letterSpacing:'1px',
    //     wordSpacing:'1px',
    //     fontSize:'17px',
    //     color:'green',
    //     lineheight:'160%',
    //     'text-align':'justify',
    //     'border-style':'double'
    // }
    

    return(
        <div className="App">
        <header className="App-header">
    <React.Fragment>
              <h1>HOME COMPONENT</h1>
                <p>
						Thiis is the homepage of the application.
					</p>
               <div>
                   {id}
                   {name}
                   {email}
               </div>
              
    </React.Fragment>
    </header>
</div>
    );

}

export default Home
