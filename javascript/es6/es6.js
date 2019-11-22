//promise function
const msg=new Promise(function(resolve,reject){
    if(30>20){
        resolve('success')
        }else{
            reject('failed')
        }
})
msg.then(function(message){
    console.log('success msg',msg)
}).catch(function(error){
    console.log('failure msg',error)
})



