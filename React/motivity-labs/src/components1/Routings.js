import React from 'react';
import { BrowserRouter, Route }  from 'react-router-dom';


//import Information/view Components...
import Header from './Header.js'
import Footer from './Footer.js'

import Home from './Home.js'
import About from './About.js'
import Services from './Services.js'
import Contact from './Contact.js'


const Routings=()=> 
{
    return (<>

<BrowserRouter>

               {/* navbar Component */ }
               
                <Header />   
               
               {/* navbar Component */ }
                              
                <Route exact path="/" component={Home} />
                <Route path="/home" component={Home} />
                <Route path="/about" component={About} />
                <Route path="/services" component={Services} />
                <Route path="/contact" component={Contact} />

                  {/* Footer Component */ }
               
                  <Footer /> 
               
                  {/* Footer Component */ }
                
</BrowserRouter>

    </>)
}


export default Routings