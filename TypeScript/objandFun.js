var Person = /** @class */ (function () {
    function Person() {
        this.pname = "Prashanth";
    }
    Person.prototype.walk = function () {
        console.log("i'am Walking and i am " + this.pname);
    };
    return Person;
}());
var a = new Person;
console.log(a.pname);
a.walk();
var Persons = /** @class */ (function () {
    function Persons(name) {
        this.name = name;
    }
    Persons.prototype.myfun = function () {
        console.log("Hi, I am " + this.name + "!");
    };
    Persons.id = 100; // static 
    return Persons;
}());
//OBJECT OF CLASS 
var obj = new Persons("Prashanth");
console.log(Persons.id);
obj.myfun();
