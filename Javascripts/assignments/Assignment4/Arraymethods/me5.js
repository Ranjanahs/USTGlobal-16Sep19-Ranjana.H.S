const dress=['chudi','lehenga','western','etnic']
console.log(typeof dress);

console.log('....isArray()........')
boolean=Array.isArray(dress)
console.log(boolean)

console.log('..........includes()...........')
console.log(dress.includes('chudi'))
console.log(dress.includes('chudi',100))

console.log('..........push()..........')
console.log(dress.push('pant'))

console.log('............pop().........')
console.log(dress.pop())

console.log(dress)

console.log('..........unshift()..........')
console.log(dress.unshift('Leggins','kurta'))

console.log('.........shift()..........')
console.log(dress.shift())

console.log(dress)
console.log('.............splice..............')
const dress1=['top','bottom','skirt']
console.log(dress1)
dress1.splice(1,2,'skirt')
console.log('After splicing method',dress1)
console.log('............slice...........')
const d=dress1.slice(2,4)
console.log(d)

console.log('......index of......')
const dd=dress.indexOf('skirt')
console.log('indexofcoding',dd)

console.log('.........join...........')
console.log(dress.join('='))

console.log('............map function..............')
const price=['100','200','300','400']
const ddd=price.map(function(value,index){
    let newvalue=value+50
    return newvalue
})
console.log(ddd)
console.log('....using fat arrow funs.........')
const dddd=price.map(value=>value+50)
console.log(dddd)

console.log('...........filter func.............')
const dd2=price.filter(function(value,index){
    if(value>200){
        return true
    }else{
        return false
    }
})
console.log(dd2)
console.log('.............using fat arrow funs..............')
const dd3=price.filter(value=>value>200)
console.log(dd3)
