console.log('named function')
function circ(r)
{
    
    var res=2*Math.PI*r;
    console.log(res)
}
circ(2)

console.log('anonymous function')
var fun=function(r)
{
    
    var res=2*Math.PI*r;
    console.log(res)
}
fun(2)

console.log('self invoked function');
(function(r)
{
    
    var res=2*Math.PI*r;
    console.log(res)
})
(2)

console.log('fat arrow function');
var func=r=>
{
    
    var res=2*Math.PI*r;
    console.log(res)
}
func(2)




