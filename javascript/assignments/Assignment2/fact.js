console.log('named function')
 function fact(n)
{
    var i,fact;
    fact=1;
    for(i=1;i<=n;i++)
    {
     fact=fact*i;
    }
    
    console.log('Factorial of number is',fact)
}
fact(4)

console.log('anonymous function')
var fun=function(n)
{
    var i,fact;
    fact=1;
    for(i=1;i<=n;i++)
    {
     fact=fact*i;
    }
    
    console.log('Factorial of number is',fact)
}
fun(4)

console.log('self invoked function');
(function fact(n)
{
    var i,fact;
    fact=1;
    for(i=1;i<=n;i++)
    {
     fact=fact*i;
    }
    
    console.log('Factorial of number is',fact)
}) (4)

console.log('fat arrow function')
var fact=n=>{
    var i,fact;
    fact=1;
    for(i=1;i<=n;i++)
    {
        fact=fact*i;
    }
    console.log('factorial of number is',fact)
}
fact(4)




