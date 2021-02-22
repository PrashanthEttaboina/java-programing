// class Electronic  
// {
//     constructor(mobilename :String ) {
//         console.log('A new Mobile is Created '+mobilename);
//     }
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
// }
// class Mobile extends Electronic
// {
//      constructor() 
// 	 {
//         super("miA3");  // using super key word
//     }
// }
// //OBJECT for CHILD CLASS 
// let obj = new Mobile();
var Person = /** @class */ (function () {
    function Person(Name) {
        this.name = Name;
    }
    Person.prototype.introduceSelf = function () {
        console.log("Hi, I am " + this.name + "!");
    };
    return Person;
}());
var Friend = /** @class */ (function (_super) {
    __extends(Friend, _super);
    function Friend(name, yearsKnown) {
        var _this = _super.call(this, name) || this;
        _this.yearsKnown = yearsKnown;
        return _this;
    }
    Friend.prototype.timeKnown = function () {
        console.log("We have been friends for " + this.yearsKnown + " years.");
    };
    return Friend;
}(Person));
var p = new Friend("Prashanth", 10);
p.introduceSelf();
p.timeKnown();
