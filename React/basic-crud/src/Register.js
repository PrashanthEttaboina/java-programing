import React, { Component } from 'react'

class Register extends Component {

    constructor(props) {
        super(props);

        this.state=
        {
            title : "This is a normal registration form",
            name:'',
            email:'',
            city:'',
            course:'',
            phone:'',
            details:[]
        }
    }


    //name_input
    HandleNameInput=(e)=>
    {
        this.setState({ name: e.target.value })
    }

    //email_input
    HandleEmailInput=(e)=>
    {
        this.setState({ email: e.target.value })
    }
    HandleCityInput=(e)=>
    {
        this.setState({ city: e.target.value })
    }


//submit_button
HandleSubmitForm=()=>
{
    alert(`${this.state.name}-${this.state.email}-${this.state.city}`);

    let details=this.state.details;
    let name=this.state.name;
    let email=this.state.email;
    let city=this.state.city;
    let course=this.state.course;
    let phone=this.state.phone;
    let data={
        name,email,city,course,phone
   }
   details.push(data);
}

    render() {
let details=this.state.details;

        return (<>
    <div className="container p-5">               
            
    <h2 align="center">{this.state.title}</h2>
            <form>
                    <div class="form-group">
                        <label>Name</label>
                        <input 
                        type="text" 
                        class="form-control" 
                        value={this.state.name}
                        onChange={this.HandleNameInput.bind(this) } />
                    </div>

                    <div class="form-group">
                        <label>Email</label>
                        <input 
                        type="email" 
                        class="form-control" 
                        value={this.state.email}
                        onChange={this.HandleEmailInput.bind(this) } />
                    </div>

                    <div class="form-group">
                        <label>City</label>
                        <input 
                        type="city" 
                        class="form-control" 
                        value={this.state.city}
                        onChange={this.HandleCityInput.bind(this) } />
                    </div>
                    <div class="form-group">
                        <label>Course</label>
                        <input 
                        type="text" 
                        class="form-control" 
                        value={this.state.course}
                        
                       />
                    </div>
                    <div class="form-group">
                        <label>Phone</label>
                        <input 
                        type="number" 
                        class="form-control" 
                        value={this.state.phone}
                       />
                    </div>
                    
                    <button 
                    type="button" 
                    class="btn btn-primary"
                    onClick={this.HandleSubmitForm}>Submit</button>

            </form>
            <h2>Registered List</h2>
        <table class="table table-bordered">
        <thead> <tr>
              <th>S.no</th>
              <th> Name</th>
              <th>Email</th>
              <th>City</th>
              <th>Course</th>
              <th>Phone</th>
              <th>Actions</th>
            </tr></thead><tbody>
        {details.map((data, i) =>
        
          <tr key={i} className="myList">
            
            <td>{i+1}</td>
            <td> {data.name}</td>
            <td> {data.email}</td>
            <td> {data.city}</td>
            <td> {data.course}</td>
            <td> {data.phone}</td>

          <td> <button class="btn-danger" onClick={()=>this.fRemove(i)} >remove </button> &nbsp;&nbsp;
            <button class="btn-primary" onClick={()=>this.fEdit(i)} >edit </button>&nbsp;&nbsp;
            </td> </tr>
          
        )}</tbody></table>
    </div>
        </>)
    }
}

export default Register 
