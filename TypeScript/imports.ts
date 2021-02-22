import {x} from './export';
console.log(x);

import {myfun} from './export';
myfun();


import Teacher from './export';

var obj=new Teacher();
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

import {square, cow} from './export';

console.log(square(2));

cow();