import React from 'react';
import ReactDOM from 'react-dom';
//import './index.css';
import './App.css';

//import App from './App';
import reportWebVitals from './reportWebVitals';

// ReactDOM.render(
//   <React.StrictMode>
//     <App />
//   </React.StrictMode>,
//   document.getElementById('root')
// );


//Routings.js from components
//import Routings from './components/Routings.js'
//Routings.js from component 1
//import Routings from './components1/Routings.js'
//Routings.js from component 
import Routings from './components3/Routings.js'
import './../node_modules/bootstrap/dist/css/bootstrap.min.css';


ReactDOM.render(
<Routings />,
document.getElementById('root') );

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
