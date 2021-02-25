//About Component...Externally
import React from 'react';

//About Component
const About=()=> {      
    

    const heights={ height:'20px' }

    return(<>

<div className="container-fluid" style={{ backgroundColor:'#12151c' }}>

<div className="container p-5 w-75 text-center">

  <h1 className="display-4 text-white font-weight-bold py-3">ABOUT US</h1>
  <p className="text-white pb-3">
    Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.
  </p>


  <div className="jumbotron bg-dark text-white" style={{ borderRadius:'10px' }}>

   <div className="row">
     <div className="col-lg-6">

      <div className="container w-100 ">
        <table className="table table-borderless text-white">
       
         
          <tr>
            <th></th>
            <td><img src="./images/profile.jpg" style={{ borderRadius:'20px',width:'35%',height:'60p' }} /></td>
          </tr>
       
          <tr>
            <th>FULLNAME</th>
            <td>Prashanth</td>
          </tr>

          <tr>
            <th>Birthday</th>
            <td>15/06/1997</td>
          </tr>

          <tr>
            <th>Mobile No</th>
            <td>7896541230</td>
          </tr>

          <tr>
            <th>Email id</th>
            <td>Prashanth@gmail.com</td>
          </tr>
        
       
      </table>
      </div>

     </div>
     <div className="col-lg-6">

      <h4>SKILLS</h4>

      <p className="text-left">HTML5 & CSS3</p>
      <div className="progress" style={ heights }>
        <div className="progress-bar bg-success"  style={{ width: '95%' }} >95%</div>
      </div>

      <p className="text-left pt-4">BOOTSTRAP4</p>
      <div className="progress" style={ heights }>
        <div className="progress-bar bg-success"   style={{ width: '90%' }} >90%</div>
      </div>

      <p className="text-left pt-4">JAVASCRIPT & JQUERY</p>
      <div className="progress" style={ heights }>
        <div className="progress-bar bg-success"   style={{  width: '85%' }} >85%</div>
      </div>

      <p className="text-left pt-4">ANGULAR</p>
      <div className="progress" style={ heights }>
        <div className="progress-bar bg-success"   style={{  width: '78%' }} >78%</div>
      </div>

     </div>
   </div>

  </div>

</div>

</div>

        </>);
}

export default About
