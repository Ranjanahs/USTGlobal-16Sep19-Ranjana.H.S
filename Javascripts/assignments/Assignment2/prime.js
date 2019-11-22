console.log('named function')
function prime(n)
{
    var p=0;
    for(var i=1;i<n;i++)
    {
        if(n%i==0)
        p++;
    }
    if(p==2)
    {
        console.log('its a prime number')
    }
    else
    {
        console.log('its not a prime number')
    }
}
prime(10)

console.log('anonymous function')
var fun=function(n)
{
    var p=0;
    for(var i=1;i<n;i++)
    {
        if(n%i==0)
        p++;
    }
    if(p==2)
    {
        console.log('its a prime number')
    }
    else
    {
        console.log('its not a prime number')
    }
}
var fun=prime(10)

console.log('self invoked function');
(function prime(n)
{
    var p=0;
    for(var i=1;i<n;i++)
    {
        if(n%i==0)
        p++;
    }
    if(p==2)
    {
        console.log('its a prime number')
    }
    else
    {
        console.log('its not a prime number')
    }
})
(10)

console.log('fat arrow function')
var func=n=>
{
    var p=0;
    for(var i=1;i<n;i++)
    {
        if(n%i==0)
        p++;
    }
    if(p==2)
    {
        console.log('its a prime number')
    }
    else
    {
        console.log('its not a prime number')
    }
}
func(10)