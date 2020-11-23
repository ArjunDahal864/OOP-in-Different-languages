class UserInfo{
    constructor(name,surname,dateofbirth){
        this.name = name,
        this.surname = surname,
        this.dateofbirth = dateofbirth
    }
    getdetails(){
        return (`The details of user \n
        name: ${this.name}\n 
        surname: ${this.surname} \n 
        birthdate:${this.dateofbirth}`)
    }
    
}

let user1 = new UserInfo("Arjun","Dahal","2001/01/5")


console.log(user1.getdetails())