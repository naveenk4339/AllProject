class Car { 
   //field 
   engine:string; 
   tire:string;
   //constructor 
   constructor(engine:string,tire:string) { 
	  this.engine = engine 
	  this.tire = tire
	  
   }   
   
   //function 
   disp():void { 
      console.log("Function displays Engine is  :   "+this.engine+" "+this.tire) 
   } 
} 

//create an object 
var objTp = new Car("tst","nave")

//access the field 
console.log("Reading attribute value Engine as :  "+objTp.engine+" "+objTp.tire)  

//access the function
objTp.disp()