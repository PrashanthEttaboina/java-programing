import React from 'react';
import { BrowserRouter, Route, Link }  from 'react-router-dom';
import {Nav, Navbar } from 'react-bootstrap';

//import Information/view Components...
import Home from './Home.js'
import About from './About.js'
import Services from './Services.js'
import Contact from './Contact.js'


const Routings=()=> 
{
    return (<>

<BrowserRouter>
<div>
<Navbar bg="dark" variant="dark">
    <Navbar.Brand href="#home">Navbar</Navbar.Brand>
    <Nav className="mr-auto">
        <ul className="nav navbar-nav">
          <li>
          <Link to="/home">Home</Link> &nbsp;&nbsp;
          </li>
          <li>
          <Link to="/about">About</Link> &nbsp;&nbsp;
          </li>
         
          <li>
          <Link to="/services">Services</Link> &nbsp;&nbsp;
          </li>
          <li>
          <Link to="/contact">Contact</Link> &nbsp;&nbsp;
          </li>
        </ul>
      </Nav>
      </Navbar>
                
                <Route exact path="/" component={Home} />
                <Route path="/home" component={Home} />
                <Route path="/about" component={About} />
                <Route path="/services" component={Services} />
                <Route path="/contact" component={Contact} />
                </div>
</BrowserRouter>

    </>)
}


export default Routings