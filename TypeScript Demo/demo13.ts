class Student{
    private id: number;
    private name: string;
    private passMark = 40;
    private _x;

    get x(){
        return this._x;
    }

    set x(value){
        if(value < 0)
            throw new Error('error')
        this._x = value;
    }

    get Id(){
        return this.id;
    }

    set Id(value){
        if(value < 0){
            throw new Error('cannot be a negative value')
        }
    }
}

let student = new Student();
student.x = '';