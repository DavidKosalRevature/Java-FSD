class Student{
    private id: number;
    private name: string;
    private passMark = 40;

    get Id(){
        return this.id;
    }

    set Id(value){
        if(value < 0)
            throw new Error('id can not be negative')
        this.id = value;
    }
}

let student = new Student();
student.Id = 50;

console.log(student)