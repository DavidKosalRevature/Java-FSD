function hello(name){
    console.log('Hello ' + name);
}

hello('Paul');

const result = (name) => 'Hello ' + name;
console.log(result('John'))

function addNumber(a,b){
    return a + b;
}
const sum = addNumber(20, 30);
console.log(sum)

const sum2 = (a, b) => a + b;
console.log(sum2(50, 40));