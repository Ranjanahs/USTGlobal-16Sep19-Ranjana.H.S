const hobbies=['sleeping','cricket','singing','dancing','roaming','coding']
console.log(typeof hobbies);

console.log('....isArray()........')
boolean=Array.isArray(hobbies)
console.log(boolean)

console.log('..........includes()...........')
console.log(hobbies.includes('caram'))
console.log(hobbies.includes('caram',100))

console.log('..........push()..........')
console.log(hobbies.push('caram','riding'))

console.log('............pop().........')
console.log(hobbies.pop())

console.log(hobbies)

console.log('..........unshift()..........')
console.log(hobbies.unshift('numismatics','singing'))

console.log('.........shift()..........')
console.log(hobbies.shift())

console.log(hobbies)
console.log('.............splice..............')
const hobbies1=['sleeping','cricket','eating','coding','roaming']
console.log(hobbies1)
hobbies1.splice(1,2,'bird watching','pubg')
console.log('After splicing method',hobbies1)
console.log('............slice...........')
const h=hobbies1.slice(2,4)
console.log(h)

console.log('......index of......')
const o=hobbies.indexOf('coding')
console.log('indexofcoding',o)

console.log('.........join...........')
console.log(hobbies.join('='))

console.log('............map function..............')
const numbers=['100','200','300','400']
const nums=numbers.map(function(value,index){
    let newvalue=value+50
    return newvalue
})
console.log(nums)
console.log('....using fat arrow funs.........')
const num2=numbers.map(value=>value+50)
console.log(num2)

console.log('...........filter func.............')
const no=numbers.filter(function(value,index){
    if(value>200){
        return true
    }else{
        return false
    }
})
console.log(no)
console.log('.............using fat arrow funs..............')
const no1=numbers.filter(value=>value>200)
console.log(no1)