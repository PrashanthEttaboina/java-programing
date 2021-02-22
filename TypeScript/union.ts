function display(value: number | string) 
{
        if(typeof(value)=="number")
        console.log("Value is number :  "+value);

        else
        console.log("value is String : " +value);
}
 
display(11);
 
display("Hello World");
