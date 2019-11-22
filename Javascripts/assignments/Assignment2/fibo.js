console.log('named function')
function fib(n)
{
    var a=0;
    var b=1;
    var c;
    console.log(a,b);
    for(var i=1;i<=n;i++)
    {
        c=a+b;
        console.log(c);
        a=b;
        b=c;
    }
}fib(5)

console.log('anonymous function')
var fun=function(n)
{
    var a=0;
    var b=1;
    var c;
    console.log(a,b);
    for(var i=1;i<=n;i++)
    {
        c=a+b;
        console.log(c);
        a=b;
        b=c;
    }
}
var fun=fib(5)

console.log('self invoked function');
(function(n)
{
    var a=0;
    var b=1;
    var c;
    console.log(a,b);
    for(var i=1;i<=n;i++)
    {
        c=a+b;
        console.log(c);
        a=b;
        b=c;
    }
}) (5)

console.log('fat arrow function')
var func=n=>
{
    var a=0;
    var b=1;
    var c;
    console.log(a,b);
    for(var i=1;i<=n;i++)
    {
        c=a+b;
        console.log(c);
        a=b;
        b=c;
    }
}
func(5)