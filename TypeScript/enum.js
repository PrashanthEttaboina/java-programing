// enum Color { Black, White, Green };
// var c: Color = Color.Green; // here c stores the index of the Color.Green
// console.log(c);  //prints the index of the value 
var Color;
(function (Color) {
    Color[Color["Black"] = 2] = "Black";
    Color[Color["White"] = 3] = "White";
    Color[Color["Green"] = 4] = "Green";
})(Color || (Color = {}));
;
var color = Color.Green;
console.log(color);
//When we print this enum value in console, it prints enum variable numeric value like 
//in the above example it prints 4 as 4 is the assigned value of Green.
//If we want to print enum name instead of number then we can assign it to any string 
//variable and prints it.
var color = Color.Green;
var colorName = Color[color];
console.log(colorName); //Green
