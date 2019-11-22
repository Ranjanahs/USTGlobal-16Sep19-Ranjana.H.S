const emp=new Promise(function(resolve,reject){
    if(5>20){
        resolve([{
            name:'billgates',
            age:67
        },{
            name:'jeff bezos',
            age:45
        }])
    }else{
        reject('failed')
    }
        
})
emp.then(function(data){
    console.log('emp data',data)
}).catch(function(error){
    console.log('failure msg',error)
})

//function within function-closures
function outerfunction(counter){
    function innerfunction(){
        let count;
        count=counter+10;
        return count
    }
    return innerfunction
}
let innerfunc=outerfunction(10)
let counter=innerfunc()
console.log('counter value',counter)

//object deconstructing
const per={
    name:'ranj'
    age:10
}
let{name,age}=per;
