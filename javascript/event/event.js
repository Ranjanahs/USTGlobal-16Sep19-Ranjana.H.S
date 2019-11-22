function showMessage(){
    alert('Hi Hello Welcome!!!')
}

function changeColor(){
    let pelement=document.getElementById('mover')
    pelement.style.color='blue'
}
function removeColor(){
    let relement=document.getElementById('mover')
    relement.style.color='black'
}
function printHello(){
console.log('Hello')
let userName=document.getElementById('username').value
document.getElementById('showusername').textContent=userName;
}

let name='Rakesh'
let age=21
let ph=46611230000
console.log('name is'+name+'Age is'+age+'ph is'+ph);
console.log(`name is ${name} Age is ${age} ph is ${ph}`)
console.log(`2 + 2 = ${2+2}`)
//document.getElementById('b1').disabled=false