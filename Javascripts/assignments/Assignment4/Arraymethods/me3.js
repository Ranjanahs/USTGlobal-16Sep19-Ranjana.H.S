const cars=['haundai','aulto','i10','ertiga']
console.log(typeof cars);

console.log('....isArray()........')
boolean=Array.isArray(cars)
console.log(boolean)

console.log('..........includes()...........')
console.log(cars.includes('i10'))
console.log(cars.includes('i10',100))

console.log('..........push()..........')
console.log(cars.push('maruthi',))

console.log('............pop().........')
console.log(cars.pop())

console.log(cars)

console.log('..........unshift()..........')
console.log(cars.unshift('audi','benz'))

console.log('.........shift()..........')
console.log(cars.shift())

console.log(cars)
console.log('.............splice..............')
const cars1=['audi','zest','nano','i20']
console.log(cars1)
cars1.splice(1,2,'jaguar')
console.log('After splicing method',cars1)
console.log('............slice...........')
const cc=cars1.slice(2,4)
console.log(cc)

console.log('......index of......')
const oo=cars.indexOf('audi')
console.log('indexofcoding',oo)

console.log('.........join...........')
console.log(cars.join('='))

console.log('............map function..............')
const carprice=['100','200','300','400']
const car=carprice.map(function(value,index){
    let newvalue=value+50
    return newvalue
})
console.log(car)
console.log('....using fat arrow funs.........')
const car1=carprice.map(value=>value+50)
console.log(car1)

console.log('...........filter func.............')
const car2=carprice.filter(function(value,index){
    if(value>200){
        return true
    }else{
        return false
    }
})
console.log(car2)
console.log('.............using fat arrow funs..............')
const car3=carprice.filter(value=>value>200)
console.log(car3)