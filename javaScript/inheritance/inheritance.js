class Person{
    constructor(name){
        this.name = name
    }


    toString(){
        return (`Name:${this.name}`)
    }
}

class Student extends Person{
    constructor(name,id){
        super(name);
        this.id = id;
    }

    toString(){
        return (`${super.toString()}\n ID ${this.id}`)
    }
    
}

    let student = new Student('Arjun',15)
    console.log(student.toString())