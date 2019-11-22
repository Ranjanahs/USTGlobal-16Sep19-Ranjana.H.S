const clg=['pes','mit','cit','ait']
console.log(typeof clg);

console.log('....isArray()........')
boolean=Array.isArray(clg)
console.log(boolean)

console.log('..........includes()...........')
console.log(clg.includes('cit'))
console.log(clg.includes('cit',100))

console.log('..........push()..........')
console.log(clg.push('mmit'))

console.log('............pop().........')
console.log(clg.pop())

console.log(clg)

console.log('..........unshift()..........')
console.log(clg.unshift('ait'))

console.log('.........shift()..........')
console.log(clg.shift())

console.log(clg)
console.log('.............splice..............')
const clg1=['sjcit','ccit','nit','sjc']
console.log(clg1)
clg1.splice(1,2,'jmit')
console.log('After splicing method',clg1)
console.log('............slice...........')
const ccc=clg1.slice(2,4)
console.log(ccc)

console.log('......index of......')
const ooo=clg.indexOf('cit')
console.log('indexofcoding',ooo)

console.log('.........join...........')
console.log(clg.join('='))

console.log('............map function..............')
const cid=['100','200','300','400']
const c=cid.map(function(value,index){
    let newvalue=value+50
    return newvalue
})
console.log(c)
console.log('....using fat arrow funs.........')
const ccid=cid.map(value=>value+50)
console.log(ccid)

console.log('...........filter func.............')
const p=cid.filter(function(value,index){
    if(value>200){
        return true
    }else{
        return false
    }
})
console.log(p)
console.log('.............using fat arrow funs..............')
const p1=cid.filter(value=>value>200)
console.log(p1)
