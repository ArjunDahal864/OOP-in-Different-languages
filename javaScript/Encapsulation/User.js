class User{
    constructor(name,id){
        this.name = name
        this.id = id
    }

    add_Address(add){
        this.add = add
    }

    getDetails(){
        console.log(
            `\n 
            Name: ${this.name}
            \n
            Address:${this.add}
        `)
    }
}

let p1 = new User("arjun",1)
p1.add_Address("Nepal")
p1.getDetails();