let element=document.getElementById('demo')
console.log('element=',element)
console.log('element text=',element.textContent)
element.textContent='Good byee'
console.log('..................................')
let button=document.createElement('button')
button.textContent="Click me!!!"
console.log('button',button)
//to add button to dom
document.body.appendChild(button);
//to create table
let ulelement=document.createElement('ul')
let li1element=document.createElement('li')
let li2element=document.createElement('li')
let li3element=document.createElement('li')

li1element.textContent='JAVA'
li2element.textContent='SQL'
li3element.textContent='JS'

ulelement.appendChild(li1element)
ulelement.appendChild(li2element)
ulelement.appendChild(li3element)
document.body.appendChild(ulelement)
//style using JS
element.style.color='violet'       
element.style.fontSize='20px'           //font-size in CS->fontSize in JS