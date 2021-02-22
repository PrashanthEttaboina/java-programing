
let myAdd = function(x, y)   //name less function
{ 
return x + y; 
};

console.log(myAdd (10,20));

function add(x: number, y: number): number  //named function
{
    return x + y;
}

console.log("The sum of 10 and 20 is "+add(10,20));


function disp_details(id:number,name?:string,mail_id?:string)    //optional parameter function
{ 
   console.log("ID:", id); 

   if(name!=undefined)
   console.log("Name",name); 
   
   if(mail_id!=undefined)  
   console.log("Email Id",mail_id); 
}

disp_details(10);
disp_details(123,"John");
disp_details(111,"mary","mary@xyz.com");


function calculate_discount(price:number,rate:number = 0.50)  //Default parameter Function
{ 
   var discount = price * rate; 
   console.log("Discount Amount: ",discount); 
} 

calculate_discount(1000);
calculate_discount(1000,0.30);


var foo = (x:number)=> 
{    
   x = 10 + x ;         // lamda function
   console.log(x) ; 
} 

foo(100);