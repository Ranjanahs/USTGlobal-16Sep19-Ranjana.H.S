const heroin=['radhika','supri','elina','aliya']
console.log(typeof heroin);

console.log('....isArray()........')
boolean=Array.isArray(heroin)
console.log(boolean)

console.log('..........includes()...........')
console.log(heroin.includes('supri'))
console.log(heroin.includes('supri',100))

console.log('..........push()..........')
console.log(heroin.push('elina'))

console.log('............pop().........')
console.log(heroin.pop())

console.log(heroin)

console.log('..........unshift()..........')
console.log(heroin.unshift('au','be'))

console.log('.........shift()..........')
console.log(heroin.shift())

console.log(heroin)
console.log('.............splice..............')
const he=['amr','tej','na','i']
console.log(he)
he.splice(1,2,'jaguar')
console.log('After splicing method',he)
console.log('............slice...........')
const r=he.slice(2,4)
console.log(r)

console.log('......index of......')
const rr=he.indexOf('audi')
console.log('indexofcoding',rr)

console.log('.........join...........')
console.log(he.join('='))

console.log('............map function..............')
const r10=['100','200','300','400']
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