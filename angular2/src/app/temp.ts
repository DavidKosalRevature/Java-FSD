//code without DI
// class Tire{
//     constructor(type: string){

//     }
// }

// class Engine{
//     constructor(type: string){

//     }
// }

// class Car{
//     engine: Engine = '';
//     tire: Tire = '';

//     constructor(){
//         this.engine = new Engine();
//         this.tire = new Tire();
//     }
// }

// code with DI
class Tire{
    constructor(tire: string){

    }

}

class Engine{
    constructor(tire: string){

    }
}

// let engine = new Engine();
// let tire = new Tire();

class Car{
    engine: Engine = '';
    tire: Tire = '';

    constructor(engine: Engine, tire: Tire){
        this.engine = engine;
        this.tire = tire;
    }
}