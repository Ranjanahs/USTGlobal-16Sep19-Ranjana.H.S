var brands=['kingfisher','bisleri','aqua','kinley']
console.log('for of loop')
for(var element of brands){
    console.log('brand=',element);
}
console.log('===================================');

console.log('for in loop')
for(var index in brands){
    console.log('brands=',brands[index])
}
console.log('===================================');
console.log('for in loop of object')
var person={
    name:'Ranjana',
    age:22,
    ph:0000
}
for(var key in person){
    console.log('value=',person[key])
}

console.log('===================================')
console.log('for each method of array')
var movies=['googli','3idiots','kirik party','pailwan']
movies.forEach(function(value,index){
    console.log('movie=',value)
    console.log('movie index=',index)
})

console.log('======================================')
console.log('for each method for objects')
var items=[{
     item:'bangles',
     id:1,
     price:500
},
{
    item:'eyeliner',
    id:2,
    price:500
},
{
    item:'shoes',
    id:3,
    price:4000
},
{
    item:'bike',
    id:4,
    price:500000
}]
items.forEach(function(value,index){
    console.log('items=',value)
    console.log('items index=',index)
})

//last diff//
var numbers=[10,20,30,40,50]
numbers['hundred']=100;
for(var i=0;i<numbers.length;i++){
    console.log('for loop',numbers[i])
}

for(var i in numbers){
    console.log('for in loop',numbers[i])
}