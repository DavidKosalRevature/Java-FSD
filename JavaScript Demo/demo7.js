class Employee{
    id;
    firstName;
    lastName;
    email;
    phone;

    getFullName(){
        //console.log(this.firstName + ' ' + this.lastName);

        console.log(`${this.firstName} ${this.lastName}`)
    }
}

class FullTimeEmployee extends Employee{
    annualSalary;
}

class PartTimeEmployeee extends Employee{
    hourSalary;
}

let fte = new FullTimeEmployee();
fte.firstName = 'Mark';
fte.lastName = 'Smith';

let pte = new PartTimeEmployeee();
pte.firstName = 'Paul';
pte.lastName = 'Watson';

fte.getFullName();
pte.getFullName();