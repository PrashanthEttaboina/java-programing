// enum Color { Black, White, Green };

// var c: Color = Color.Green; // here c stores the index of the Color.Green

// console.log(c);  //prints the index of the value 


enum Color { Black =2, White = 3, Green = 4 };

var color: Color = Color.Green;

console.log(color);

//When we print this enum value in console, it prints enum variable numeric value like 
//in the above example it prints 4 as 4 is the assigned value of Green.

//If we want to print enum name instead of number then we can assign it to any string 
//variable and prints it.

var color: Color = Color.Green;
 
var colorName: string = Color[color];

console.log(colorName); //Green


