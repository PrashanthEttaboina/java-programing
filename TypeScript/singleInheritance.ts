// class Electronic  
// {
//     constructor(mobilename :String ) {
//         console.log('A new Mobile is Created '+mobilename);
//     }
 
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




class Person 
{
    private name: string ;
    
	constructor(Name: string) 
	{
        this.name = Name;
    }
	
	introduceSelf() 
	{
        console.log("Hi, I am " + this.name + "!");
    }

}
 
class Friend extends Person 
{
    yearsKnown: number;

    constructor(name: string, yearsKnown: number) 
	{
        super(name);
        this.yearsKnown = yearsKnown;
    }
 
 timeKnown() 
 {
        console.log("We have been friends for " + this.yearsKnown + " years.")
 }
 
}
 let p=new Friend("Prashanth" , 10);  //passing values 
 
 p.introduceSelf();   //Hi, I am Prashanth!
 
 p.timeKnown(); //We have been friends for 10 years.