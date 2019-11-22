const laptop=['dell','hp','asus','sony']
console.log(typeof laptop);

console.log('....isArray()........')
boolean=Array.isArray(laptop)
console.log(boolean)

console.log('..........includes()...........')
console.log(laptop.includes('dell'))
console.log(laptop.includes('dell',200))

console.log('..........push()..........')
console.log(laptop.push('lg'))

console.log('............pop().........')
console.log(laptop.pop())

console.log(laptop)

console.log('..........unshift()..........')
console.log(laptop.unshift('dell','asus'))

console.log('.........shift()..........')
console.log(laptop.shift())

console.log(laptop)
console.log('.............splice..............')
const he=['dell','asus','lg','hp']
console.log(he)
he.splice(1,2,'dell')
console.log('After splicing method',he)
console.log('............slice...........')
const r=he.slice(2,4)
console.log(r)

console.log('......index of......')
const rr=he.indexOf('apple')
console.log('indexofcoding',rr)

console.log('.........join...........')
console.log(he.join('='))

console.log('............map function..............')
const r10=['1000','2000','3000','4000']
const i=r10.map(function(value,index){
    let newvalue=value+50
    return newvalue
})
console.log(i)
console.log('....using fat arrow funs.........')
const j=r10.map(value=>value+50)
console.log(j)

console.log('...........filter func.............')
const k=r10.filter(function(value,index){
    if(value>200){
        return true
    }else{
        return false
    }
})
console.log(k)
console.log('.............using fat arrow funs..............')
const kk=r10.filter(value=>value>200)
console.log(kk)