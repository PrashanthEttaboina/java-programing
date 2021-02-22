"use strict";
exports.__esModule = true;
exports.cow = exports.square = exports.myfun = exports.x = void 0;
exports.x = 123;
function myfun() {
    var x = 10;
    var y = 20;
    console.log(x + " " + y);
}
exports.myfun = myfun;
var Teacher = /** @class */ (function () {
    function Teacher() {
    }
    Teacher.prototype.work = function () {
        console.log('I am teaching');
    };
    return Teacher;
}());
exports["default"] = Teacher;
// interface IWork 
// {
//     work(): void;
// }
// export default IWork;
function square(x) {
    return Math.pow(x, 2);
}
exports.square = square;
function cow() {
    console.log("Mooooo!!!");
}
exports.cow = cow;
