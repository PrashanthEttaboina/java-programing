class A
{
    a: number; 
   
    constructor(a : number)
    {
        this.a=a;
    }
    
    methoda()
    {
        console.log("This method is from class A and the value of a is "+this.a );
    }
}

class B extends A
{
    b: any;
    constructor(a: number , b: any) 
	{
        super(a);
        this.b = b;
    }
methodb()
{
    console.log("This method is from class B and the value of b is " +this.b);
}
}
class C extends B
{
    name: String;
    constructor(name : String ,a: number, b:any)
    {
        super(a,b);
        this.name=name;
        console.log(`name is `+this.name);
    }
    methodc()
    {
        console.log("values send from class C ")
    }
}

let x=new C("Prashanth" ,10,"Hello World!!");
x.methoda();
x.methodb();
x.methodc();