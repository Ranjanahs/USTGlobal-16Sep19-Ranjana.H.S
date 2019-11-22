//named funs
console.log('named funs')
add(10,20)
function add(num1,num2){
    console.log('sum=',num1+num2)
}

function add1(num1,num2,num3){
    console.log('sum1=',num1+num2+num3)
}
add1(10,20,30)

//anonymous funs
console.log('anonymous funs')
var fun=function sub(a,b){
    console.log('diff=',a-b);
    return a-b;
}
var value=fun(9,2);
console.log('value=',value)

// self invoked funs//
console.log('self invovked funs');
(function(n1,n2){
    console.log('res=',n1*n2);
}) (20,30)

// fat arrow funs//
console.log('fat arrow funs')
var div=(n1,n2)=>{
    console.log('ans=',n1/n2);
}
div(10,2)

var div1=num1=>{
    console.log('sol=',num1);
}
div1(10)

var div2=num1=>console.log(num1);
div2(30)

var add1=(num1,num2)=>num1+num2;
var value=add(30,40);

//named funs wt strings
greeting('Chandhan');
function greeting(msg){
    console.log(msg)
}

//
greet('Dinga')
var greet=function(msg)
{
    console.log('Hi',msg);
}

greets('dingi')
var greets=function(msg)
{
    console.log('hii',msg)
}