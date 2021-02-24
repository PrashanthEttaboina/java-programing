import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { EmployeeService } from 'src/app/services/employee.service';
import { Employee } from "src/app/model/employee.model";
@Component({
  selector: 'app-employees',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.css']
})
export class EmployeesComponent implements OnInit {

  search : any;

  employees: Employee[] = [];
  constructor(private employeeservice:EmployeeService) { }

  ngOnInit(): void {
    this.employees = this.employeeservice.onGet();
  }

  onDelete(id:number){
    this.employeeservice.onDelete(id);
  }

  ename:string="";
  onSearch(form : NgForm){
    this.ename= form.value.name;
    this.employees= this.employeeservice.onSearch(this.ename);
  }
}
