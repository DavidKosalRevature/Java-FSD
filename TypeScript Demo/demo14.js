var Student = /** @class */ (function () {
    function Student() {
        this.passMark = 40;
    }
    Object.defineProperty(Student.prototype, "Id", {
        get: function () {
            return this.id;
        },
        set: function (value) {
            if (value < 0)
                throw new Error('id can not be negative');
            this.id = value;
        },
        enumerable: false,
        configurable: true
    });
    return Student;
}());
var student = new Student();
student.Id = 50;
console.log(student);
