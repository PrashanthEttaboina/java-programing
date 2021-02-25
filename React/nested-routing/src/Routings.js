import React from 'react';
import { BrowserRouter, Route, Switch, Redirect }  from 'react-router-dom';


//import Information/view Components...
import Header from './Header.js'
import Footer from './components/Footer.js'

import Home from './components/Home.js'
import About from './components/About.js'
import Services from './components/Services.js'
import Blog from './components/Blog.js'
import Portfolios from './components/Portfolios.js'
import Contact from './components/Contact.js'
import Pagenotfound from './components/Pagenotfound.js'
import Courses from './Courses'




const Routings=()=> 
{
    return (<>

<BrowserRouter>

               {/* navbar Component */ }
               
                <Header />   
               
               {/* navbar Component */ }
              
            <Switch>
                <Route exact path="/" component={Home} />
                <Route path="/home" component={Home} />
                <Route path="/about" component={About} />
                <Route path="/courses" component={Courses} />
                <Route path="/services" component={Services} />
                <Route path="/portfolios" component={Portfolios} />
                <Route path="/blog" component={Blog} /> 
                <Route path="/contact" component={Contact} />
                {/* <Route path="/props" component={Propsobject} /> */}
               
                <Redirect to="/home" />
                <Route  component={Pagenotfound} />
            </Switch>


                  {/* Footer Component */ }
               
                  <Footer /> 
               
                  {/* Footer Component */ }

                
</BrowserRouter>

    </>)
}

export default Routings