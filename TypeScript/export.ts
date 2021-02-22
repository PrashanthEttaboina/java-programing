export var x = 123;


export function myfun ()
	{
			var x=10;
			var y=20;
			console.log(x+" "+y);
    }

    class Teacher {
	
        public work(): void {
            console.log('I am teaching');
        }
     
    }
     
    export default Teacher;

    // interface IWork 
    // {
    //     work(): void;
    // }
     
    // export default IWork;

    function square(x) {
        return Math.pow(x,2)
    }
    
    function cow() {
        console.log("Mooooo!!!")
    }
    
    export {square, cow};