console.log("Hello world");
console.log(12456);
// print we need to do console.log();
//In terminal we need to click new terminal and select git bash on terminal and then type node app.js (your file name)
console.log("New programming and new energy");

// declaration
// function add(x,y){
//     return x + y;
// }


// expression
// const add = function(x,y){
//     return x + y
// }


// //arrow
// const add = (x,y) => x + y

// function customMessage(message, times) {
//     for (let i = 0; i < times; i++) {
//     console.log(i, message) ;
//     }
//    }
//    customMessage("Hello!", 3);
   

//    function add(a, b) {
//     let c = a + b;
//     return c;
//    }
//    let result = add(3, 5);
//    console.log(result);


// const scope = "global"; // Declare scope global
// function checkscope() {
//  let scope = "local"; // Declare scope local
//  return scope; // Return local value
// }
// const result = checkscope();
// console.log(result); 







// const scope = "global scope"; // A global variable


// function checkscope() {

//  let scope = "local scope"; // A local variable

//  function nested() {

//  let scope = "nested scope"; // A nested local variable
//  return scope; // Return the value in this scope

//  }

//  return nested();
// }
// const result = checkscope();
// console.log(result);


// const x = 1;

// hoist();

function hoist() { 
    const x = 2;
 console.log(x);
 // ReferenceError
}

// const err = new Error('Custom Error made by the developer.');
// console.log(err);


// const customerError = new Error('CustomError made by the developer.');

// function someFunc(a) {
//  if (a === 4) {
//  throw customerError; 
//  }
// }
// try {
//  someFunc(4);
// } catch (e) {
//  console.log("Logging Customer Error:")
//  console.log(e)
// }


// let person = {
//     firstName: "John",
//     lastName: "Doe",
//     age: 50,
//     eyeColor: "blue"
//     };
    
// person.age = 99;
// person.hairColor = "green"

// console.log(person.hairColor)


// delete person.hairColor

// console.log(person.hairColor)


// console.log(person.firstName + " is " + person["age"] + " years old.");


//keys
// const objectKeys = Object.keys(person);
// console.log(objectKeys); 


// //values
// const objectValues = Object.values(person);
// console.log(objectValues); 



// //entries
// const objectEntries = Object.entries(person);
// console.log(objectEntries); 




// const person = {
//     firstName: "John",
//     lastName: "Doe",
//     age: 50,
//     eyeColor: "blue",
//     people: {1:"John",2:"Sam",3:"Lisa"}
// };


//     person.people[4] = "David"

// console.log(person.people[4])
//     // console.log(person.fullName());


// const d= new Date();

// console.log(d)

// const d2= new Date((2021,11,24,10,33,30,0));

// console.log(d2)
// const d3= new Date(2021, 11, 24);

// console.log(d3)

// const d4= new Date("October 13, 2021 11:13:00");

// console.log(d4)

// const d5= new Date(6400000);

// console.log(d5)


// const min = 5;
// const max = 10;


// let value = Math.floor(Math.random() * (max - min + 1) + min);


// console.log(value);


// function randomWholeNumber(min, max) {
//     return Math.floor(Math.random() * (max - min + 1) + min);
//     }
//     console.log(randomWholeNumber(5, 10)); // numbers from 5 to 10
//     console.log(randomWholeNumber(7, 42)); // numbers from 7 to 42
//     console.log(randomWholeNumber(1, 100)); // numbers from 1 to 100
//     console.log(randomWholeNumber(-10, 10)); // numbers from -10 to 10
//     console.log(randomWholeNumber(-4, 20)); 



// const arr1 = [1,2,3,4]

// const arr2 = ["Jim","Sam","Lisa"]


// const arr3 = ["Jim",3,"Lisa",true,null]

// console.log(arr3[3])



// const multiArray = [
//     [{ key1: "value1", key2: "value2" },
//     { key1: "value3", key2: "value4" }],
//     [{ key1: "value5", key2: "value6" },
//      { key1: "value7", key2: "value8" }]
//     ];
    



// console.log(multiArray[1][0]["key2"]); 

    // console.log(multiArray[0][0]["key1"])


//  const arr2 = ["Jim","Sam","Lisa"]


//  //adds to the end of an array
//  arr2.push("Ray")


//  //deletes from the end of an array
//  arr2.pop()

// console.log(arr2[3])


// const a = [1, 2, 3]; // a new array with three elements
// const x = a.join(); // “1,2,3”
// const y = a.join(" "); // “1 2 3”
// const z = a.join("/"); 
// console.log(z)


// const a = [1, 2, 3]; // a new array with three elements
// let b = a.reverse().join(); // b = “3,2,1”
// console.log(a); // [3, 2, 1]
// console.log(b);


// let a = ["banana", "cherry", "apple"];

// const a1 = [1, 2, 3,6,5]; 

// a1.sort();

// console.log(a1)

// const s = a.join(" is good, ");
// console.log(s); // apple is good, banana is good, cherry
// let fruits = ["banana", "orange", "apple", "mango"];
// fruits.sort();
// console.log(fruits); 



// const a = [1, 2, 3, 4, 5];
// // const w = a.slice(0, 4); // w = [1, 2, 3]
// // const x = a.slice(3); // x = [4, 5]
// const y = a.slice(1, -1); // y = [2, 3, 4]
// console.log(y); 
// const z = a.slice(-3, -2); // z = [3]


// let fruits = ["banana", "orange", "apple", "mango"];
// fruits.splice(1, 0, "lemon", "kiwi","grape");
// console.log(fruits);


let a = [23, 32, 45, 67, 77, 67, 98, 12];


// for (let i = 0; i < a.length; i++) {
//     console.log(a[i]); // will output each element of the array
//    }

//    for (const num of a) {
//         console.log(num)
//    }
   

//    for(const i in a){
//     console.log(a[i])
//    }


const person = {
    firstName: "John",
    lastName: "Doe",
    age: 50,
    eyeColor: "blue"
    };



    for (const x in person) {
        console.log(x + ": " + person[x]);
    }