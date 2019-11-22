const hero=['yash','puneeth','sudeep','darshan']
console.log(typeof hero);

console.log('....isArray()........')
boolean=Array.isArray(hero)
console.log(boolean)

console.log('..........includes()...........')
console.log(hero.includes('ramesh'))
console.log(hero.includes('ramesh',100))

console.log('..........push()..........')
console.log(hero.push('maruthi',))

console.log('............pop().........')
console.log(hero.pop())

console.log(hero)

console.log('..........unshift()..........')
console.log(hero.unshift('audi','benz'))

console.log('.........shift()..........')
console.log(hero.shift())

console.log(hero)
console.log('.............splice..............')
const hero1=['shiv','jaggi','vinay']
console.log(hero1)
hero1.splice(1,2,'jaggi')
console.log('After splicing method',hero1)
console.log('............slice...........')
const e=hero1.slice(2,4)
console.log(e)

console.log('......index of......')
const ee=hero1.indexOf('yash')
console.log('indexofcoding',ee)

console.log('.........join...........')
console.log(hero.join('='))

console.log('............map function..............')
const rate=['100','200','300','400']
const her=rate.map(function(value,index){
    let newvalue=value+50
    return newvalue
})
console.log(her)
console.log('....using fat arrow funs.........')
const hr1=rate.map(value=>value+50)
console.log(hr1)

console.log('...........filter func.............')
const hr2=rate.filter(function(value,index){
    if(value>200){
        return true
    }else{
        return false
    }
})
console.log(hr2)
console.log('.............using fat arrow funs..............')
const hr3=rate.filter(value=>value>200)
console.log(hr3)
