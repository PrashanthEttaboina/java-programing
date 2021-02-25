import React from 'react';
import { BrowserRouter, Route, Switch, Link, Redirect} from 'react-router-dom';

//Components
import Mernstack from './courses/Mernstack.js'
import Meanstack from './courses/Meanstack.js'
import Angularjs from './courses/Angularjs'
import Reactjs from './courses/Reactjs'
import Python from './courses/Python'
import MYPHP from './courses/Php.js'

const Courses=( { match } )=> {

const parentroute=match.path

    return (<>
    <BrowserRouter>
        <div className="container py-5" >
            
            <div className="row">
                
                {/*  Left column Block */}
                <div className="col-lg-3">

                    <nav>
                        <ul className="list-group">
                            <li className="list-group-item">
                                <Link to={`${parentroute}/mernstack`}>MERNSTACK</Link>
                            </li>

                            <li className="list-group-item">
                                <Link to={`${parentroute}/meanstack`}>MEANSTACK</Link>
                            </li>

                            <li className="list-group-item">
                                <Link to={`${parentroute}/angularjs`}> ANGULAR</Link>
                            </li>

                            <li className="list-group-item">
                                 <Link to={`${parentroute}/reactjs`}>REACT</Link>
                            </li>

                            <li className="list-group-item">
                                <Link to={`${parentroute}/python`}>PYTHON</Link>
                            </li>

                            <li className="list-group-item">
                                <Link to={`${parentroute}/php`}>PHP</Link>
                            </li>

                        </ul>
                    </nav>

                </div>
                {/*  Left column Block */}

                {/*  Right column Block */}
                <div className="col-lg-9">

                    


                <Switch>
                    <Route exact path={parentroute} component={ Mernstack } />
                    <Route  path={`${parentroute}/mernstack`} component={ Mernstack } />
                    <Route  path={`${parentroute}/meanstack`} component={ Meanstack } />
                    <Route  path={`${parentroute}/angularjs`} component={ Angularjs } />
                    <Route  path={`${parentroute}/reactjs`} component={ Reactjs } />
                    <Route  path={`${parentroute}/python`} component={ Python } />
                    <Route  path={`${parentroute}/php`} component={ MYPHP } />
                    <Redirect to={parentroute} />
                </Switch>


                </div>
                 {/*  Right column Block */}
                
            </div>

        </div>
        </BrowserRouter>
    </>)
}


export default Courses