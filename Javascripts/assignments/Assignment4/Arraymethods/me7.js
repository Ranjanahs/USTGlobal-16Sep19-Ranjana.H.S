const name=['ranj','anj','sanj','ranji']
console.log(typeof name);

console.log('....isArray()........')
boolean=Array.isArray(name)
console.log(boolean)

console.log('..........includes()...........')
console.log(name.includes('anj'))
console.log(name.includes('anj',100))

console.log('..........push()..........')
console.log(name.push('maruthi',))

console.log('............pop().........')
console.log(name.pop())

console.log(name)

console.log('..........unshift()..........')
console.log(name.unshift('ash','tej'))

console.log('.........shift()..........')
console.log(name.shift())

console.log(name)
console.log('.............splice..............')
const names=['ash','hem','pravs','sandy']
console.log(names)
names.splice(1,2,'ash')
console.log('After splicing method',names)
console.log('............slice...........')
const n=names.slice(2,4)
console.log(n)

console.log('......index of......')
const nn=names.indexOf('ash')
console.log('indexofcoding',nn)

console.log('.........join...........')
console.log(names.join('='))

console.log('............map function..............')
const names1=['100','200','300','400']
const na=names1.map(function(value,index){
    let newvalue=value+50
    return newvalue
})
console.log(names1)
console.log('....using fat arrow funs.........')
const nam=names1.map(value=>value+50)
console.log(nam)

console.log('...........filter func.............')
const namm=names1.filter(function(value,index){
    if(value>200){
        return true
    }else{
        return false
    }
})
console.log(namm)
console.log('.............using fat arrow funs..............')
const namw=names1.filter(value=>value>200)
console.log(namw)

