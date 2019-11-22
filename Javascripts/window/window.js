console.log('Window object',window);
console.log('this keyword',this);
console.log(this==window)

//for alert msg-alert()
//window.alert('Welcome to UST Global')
//alert('Hii hello')

//confirm()
//let v=confirm('are you sure you want to delete?');
//console.log('delete',v)

//prompt()-to get input frm pop up
//let name=prompt('birth-date','26/04/1997')
//console.log('name')

//this keyword will change only whenever you invoke a method or func using object.All these details will be stored in object. 
const person={
    firstname:'Aliya',
    age:26,
    lastname:'kapoor',
    getname:function(){
        console.log('This keyword',this)
        return this.firstname +' '+this.lastname
    }

}
let fullname=person.getname()
console.log('fullname',fullname)