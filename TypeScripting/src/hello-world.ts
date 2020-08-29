var a: number;
var b: boolean;
var c: String;
var foo : undefined;

a =10;
b=true;
c='test';
var fn = ()=>  'tesd';

var myArr : number[];
myArr =[];
myArr =[1,4];
myArr.push(1);
a=myArr.pop();

//tuple
var tupleArr : [number,boolean];
tupleArr = [1, false];
tupleArr =[2, true];


function add(a: number, b: number,c?:number) : number{
    return a + b;
}


var sum = add(67,4);
console.log(sum);

var x= 0;
var y =true;
var z = 'String';

function greet(): string {
    return "Good Morning";
}

var greeting;
greeting = greet();
greeting = 10;

console.log(greeting);

var h : number | boolean;
//h ='string';
h=10;
h=true;