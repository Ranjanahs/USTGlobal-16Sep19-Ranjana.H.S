let myname:string="ranjana";
console.log(myname,typeof myname);

let age:number;
console.log(age,typeof age);

let mobileno=123445566;
console.log(mobileno,typeof mobileno);

let address;
console.log(address,typeof address);

let addr;
addr="asdfg";
addr=890;
console.log(addr,typeof addr);
console.log(".......functions...........")
let a=function():void{
    console.log("age is:26");
}
a();

console.log("...........constructor............")
class person{
    constructor(public name:string,public age:number){

    }
}
let per1=new person('Ranjana',22);
console.log(per1);

console.log("............inheritance...........");
class student extends person{
    constructor(name:string,age:number,public rollno:number){
        super(name,age);
    }
}
let stu1=new student("tms",22,4);
console.log(stu1);
