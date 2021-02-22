"use strict";
exports.__esModule = true;
var export_1 = require("./export");
console.log(export_1.x);
var export_2 = require("./export");
export_2.myfun();
var export_3 = require("./export");
var obj = new export_3["default"]();
obj.work();
//import {interface} from './export';
// import IWork from './export';
// class Lecturer implements IWork {
//     public tenure: boolean;
//     constructor() {
//         this.tenure = true;
//     }
//     public work(): void {
//         console.log("I am teaching");
//     }
// }
// var obj=new Lecturer();
// obj.work();
var export_4 = require("./export");
console.log(export_4.square(2));
export_4.cow();
