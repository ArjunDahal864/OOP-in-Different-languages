function user(name,surname){
    this.name = name,
    this.surname = surname
}

let user1 = new user("arjun","Dahal")
let user2 = new user("arjun","Dahal")

console.log(user1.name)
console.log(`${user2.name}`)