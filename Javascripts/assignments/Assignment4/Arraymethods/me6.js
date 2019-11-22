const carss=['haundai','aulto','i10','ertiga']
console.log(typeof cars);

console.log('....isArray()........')
boolean=Array.isArray(carss)
console.log(boolean)

console.log('..........includes()...........')
console.log(carss.includes('i10'))
console.log(carss.includes('i10',100))

console.log('..........push()..........')
console.log(carss.push('maruthi',))

console.log('............pop().........')
console.log(carss.pop())

console.log(carss)

console.log('..........unshift()..........')
console.log(carss.unshift('audi','benz'))

console.log('.........shift()..........')
console.log(carss.shift())

console.log(carss)
console.log('.............splice..............')
const carss1=['audi','zest','nano','i20']
console.log(carss1)
carss1.splice(1,2,'jaguar')
console.log('After splicing method',carss1)
console.log('............slice...........')
const ccs=carss1.slice(2,4)
console.log(ccs)

console.log('......index of......')
const q=carss.indexOf('audi')
console.log('indexofcoding',queueMicrotask)

console.log('.........join...........')
console.log(carss.join('='))

console.log('............map function..............')
const carprices=['100','200','300','400']
const carr=carprices.map(function(value,index){
    let newvalue=value+50
    return newvalue
})
console.log(carr)
console.log('....using fat arrow funs.........')
const carrr=carprices.map(value=>value+50)
console.log(carrr)

console.log('...........filter func.............')
const ca=carprices.filter(function(value,index){
    if(value>200){
        return true
    }else{
        return false
    }
})
console.log(ca)
console.log('.............using fat arrow funs..............')
const car4=carprices.filter(value=>value>200)
console.log(car4)

