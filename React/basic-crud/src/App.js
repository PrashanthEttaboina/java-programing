import React, { Component } from 'react';
import './App.css';

class App extends Component {
constructor(props){
  super(props);
  this.state={
    title: 'React Simple CRUD Application',
    act: 0,
    index: '',
    datas: []
  }
} 

componentDidMount(){
  this.refs.name.focus();
}

fSubmit = (e) =>{
  e.preventDefault();
  console.log('try');

  let datas = this.state.datas;
  let name = this.refs.name.value;
  let address = this.refs.address.value;

  if(this.state.act === 0){   //new
    let data = {
      name, address
    }
    datas.push(data);
  }else{                      //update
    let index = this.state.index;
    datas[index].name = name;
    datas[index].address = address;
  }    

  this.setState({
    datas: datas,
    act: 0
  });

  this.refs.myForm.reset();
  this.refs.name.focus();
}

fRemove = (i) => {
  let datas = this.state.datas;
  datas.splice(i,1);
  this.setState({
    datas: datas
  });

  this.refs.myForm.reset();
  this.refs.name.focus();
}

fEdit = (i) => {
  let data = this.state.datas[i];
  this.refs.name.value = data.name;
  this.refs.address.value = data.address;

  this.setState({
    act: 1,
    index: i
  });

  this.refs.name.focus();
}  

render() {
  let datas = this.state.datas;
  return (
    <div className="App">
      <h2>{this.state.title}</h2>
      <form ref="myForm" className="myForm">
        <input type="text" ref="name" placeholder="your name" className="formField" />
        <input type="text" ref="address" placeholder="your address" className="formField" />
        <button onClick={(e)=>this.fSubmit(e)} className="myButton">submit </button>
      </form>
      
        <h2>Employee List</h2>
        <table class="table table-bordered">
        <thead> <tr>
              <th>S.no</th>
              <th>Employee Name</th>
              <th>Address</th>
              <th>Actions</th>
            </tr></thead><tbody>
        {datas.map((data, i) =>
        
          <tr key={i} className="myList">
            
            <td>{i+1}</td>
            <td> {data.name}</td>
            <td> {data.address}</td>
          <td> <button class="btn-danger" onClick={()=>this.fRemove(i)} >remove </button> &nbsp;&nbsp;
            <button class="btn-primary" onClick={()=>this.fEdit(i)} >edit </button>&nbsp;&nbsp;
            </td> </tr>
          
        )}</tbody></table>
     
    </div>
  );
}
}

export default App;