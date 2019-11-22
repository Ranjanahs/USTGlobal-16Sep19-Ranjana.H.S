const items=[{
    name:'earing',
    id:1,
    price:5000
   },{
    name:'khajal',
    id:2,
    price:500
   },{
    name:'trimmer',
    id:3,
    price:3000
   },{
    name:'beardo',
    id:4,
    price:2000
   }
]

// const updatedItems=items.map(function(item,index){
    // item.price=item.price+300;
    // return item
// })
// console.log(items)

const itemsArrow=items.map((value)=>{
    value.price=value.price+300;
    return value
})
console.log(items)
//filter
const filteredItems=
      items.filter((item)=>item.price>1000)
      console.log(filteredItems)