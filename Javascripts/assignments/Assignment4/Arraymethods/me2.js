const bikes=['tvs','haundai','apache','rx','splender']
console.log(typeof bikes);

console.log('....isArray()........')
boolean=Array.isArray(bikes)
console.log(boolean)

console.log('..........includes()...........')
console.log(bikes.includes('RY'))
console.log(bikes.includes('RY',100))

console.log('..........push()..........')
console.log(bikes.push('RS',))

console.log('............pop().........')
console.log(bikes.pop())

console.log(bikes)

console.log('..........unshift()..........')
console.log(bikes.unshift('tvss','PY'))

console.log('.........shift()..........')
console.log(bikes.shift())

console.log(bikes)
console.log('.............splice..............')
const bikes1=['shine','scooty','tvs','activa']
console.log(bikes1)
bikes1.splice(1,2,'pubg')
console.log('After splicing method',bikes1)
console.log('............slice...........')
const h1=bikes1.slice(2,4)
console.log(h1)

console.log('......index of......')
const o1=bikes.indexOf('coding')
console.log('indexofcoding',o1)

console.log('.........join...........')
console.log(bikes.join('='))

console.log('............map function..............')
const bikes2=['100','200','300','400']
const nums1=bikes2.map(function(value,index){
    let newvalue=value+50
    return newvalue
})
console.log(nums1)
console.log('....using fat arrow funs.........')
const num3=bikes2.map(value=>value+50)
console.log(num3)

console.log('...........filter func.............')
const no3=bikes2.filter(function(value,index){
    if(value>200){
        return true
    }else{
        return false
    }
})
console.log(no3)
console.log('.............using fat arrow funs..............')
const no2=bikes2.filter(value=>value>200)
console.log(no2)
