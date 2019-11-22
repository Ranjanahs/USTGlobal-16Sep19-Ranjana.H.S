function first(){
    setTimeout(function() {
        console.log('1st func executed')
     },0)                                  //setTimeout(callback function,mllisecons)//   
   
}

function second(){
    console.log('2nd func executed')
}

first()
second()


function firs(){
    setTimeout(function() {
        console.log('1st func executed')
     },0)                                  //setTimeout(function,mllisecons)//   
   console.log('executed')
}

function secon(){
    console.log('2nd func executed')
}

firs()
secon()

console.log('-------------------------------')

function fir(callback){
    setTimeout(function() {
        console.log('1st func executed')
        callback();
     },0)                                  //setTimeout(function,mllisecons)//   
   //console.log('executed')
}

function seco(){
    console.log('2nd func executed')
}

fir(seco)
