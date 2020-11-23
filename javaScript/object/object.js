let user = {
    first_name:"Arjun",
    last_name:"Dahal",

    getUser :() => (`The name of the person ${user.first_name}`),
    phone_number:{
        // nested object
        mobile:"9842441224",
        landline:"01-555665255"
    },
}


console.log(user.getUser())
console.log(user.phone_number.mobile)
console.log(user.phone_number.landline)
