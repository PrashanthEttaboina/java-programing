class Person
{
     pname : String = `Prashanth`;

    walk()
    {
       console.log(`i'am Walking and i am `+this.pname);
    }
}

let a=new Person;
console.log(a.pname);
a.walk();


class Persons 
{
    name: string;
	static id : number =100;  // static 
	
    constructor(name: string) 
	{
        this.name=name;
    }
	
    myfun() 
	{
        console.log("Hi, I am " + this.name + "!");
    }
	
}
 
//OBJECT OF CLASS 
let obj= new Persons("Prashanth");
console.log(Persons.id);
obj.myfun();