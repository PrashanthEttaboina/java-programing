var person = {
    firstName: "Tom",
      lastName: "Hanks",

      sayHello:function() {
         
       }
};
 
 person.sayHello = function() 
 {  
    console.log("hello "+person.firstName);
    console.log("his full name is "+person.firstName+" "+person.lastName);
 }  
 
 person.sayHello();