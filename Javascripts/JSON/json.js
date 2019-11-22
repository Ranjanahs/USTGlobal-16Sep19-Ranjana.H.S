const person={
             name:'Sundara',
             age:100,
             color:'white',
             address:{
                    city:'Bangalore',
                    state:'karnataka',
                    pincode:571401
                    },
             hobbies:['coding','typing','singing','birdwatching']
            }
        console.log('JS person object',person)
        const jsonObject=JSON.stringify(person)
        console.log('JSON person object',jsonObject)
        // JS object is converted to JSON object.
        const JSPersonObject=JSON.parse(jsonObject)
        console.log('JS person Object after parse',JSPersonObject)
        // JSON object is converted to JS object.

        //local storage
        localStorage.setItem('email','billgates@gmail.com')
        const emailID=localStorage.getItem('email')
        console.log('email ID=',emailID)
        localStorage.clear();