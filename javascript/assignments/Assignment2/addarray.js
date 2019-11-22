console.log('named function')
function add(a)
{
    var sum=0;
    for(var i=0;i<a.length;i++)
    sum=sum+a[i];
    console.log(sum)
}
add([10,20,30])

console.log('Anonymous function')
var fun=function(a)
{
    var sum=0;
    for(var i=0;i<a.length;i++)
    sum=sum+a[i];
    console.log(sum)
}
fun([10,20,30])

console.log('self invoked function');
(          function(a)
{
    var sum=0;
    for(var i=0;i<a.length;i++)
    sum=sum+a[i];
    console.log(sum)
})([10,20,30])


console.log('fat arrow function');
var func=a=>
{
    var sum=0;
    for(var i=0;i<a.length;i++)
    sum=sum+a[i];
    console.log(sum)
}
func([10,20,30])

