////////////////////////////////////
//  December 7th 2019             //
//  EXAM DATE: December 8th 2019  //
///////////////////////////////////


//Lecture 1:
// - A computer program tells a computer how to solve problems
// - In order to do this the computer requires data and a process to solve the problem

//How does it do this?
//      1.                       2.                     3.             4.
//Human Language >> Structure Programming Language >> Assembly >> Machine Language

//How does it work, specifically for Java?
//Text editor (saves Java statements) >> source code (.java) >> java compiler (reads sc + compiles)
// >> byte code (.class) >> JVM (interpreter) interprets the program line by line >> execution

//The portability of java involves compilation but the actual program is executed by the interpreter!

//Lets talk about OOP
//OOP – Offers enhanced maintainability through a set of principles:
// o	Information Hiding – data is only accessible by the code directly related to it
// o	Encapsulation – a mechanism to implement information hiding (aka. Protecting)
// o	Objects – a bundle of related data and the processing that applies to it
// o	Classes – template for similar objects
// o	Instantiation – creating an object based on a class
// o	Message passing – executing a method through a given object
// o	Inheritance – Extending (Specification) or Abstracting(Generalization) given Classes or Concepts
// o	Polymorphism – the ability to have several implementations of an inherited method

////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Lecture 2:
//Web applications: Before JS appeared in 1995, every action was handled server side
// to that, every action would require a round trip to and from the server
//Netscape Navigator introduced JS and solved this


//Other random info for lecture 1, 2 and beyond:
//o	Compilation = translation + linking
// o	Create a java program involves a compilation step but the actual program is executed by the JVM which is an interpreter(translates and executes the program line by line)
// o	Java and similar languages are considered hybrid languages
// o	Before Javascript was created in 1995, every action had to be handled server side
// o	Netscape Navigator introduced Javascript to change this
// o	Original name for JS was Mocha
// o	Netscape formed an alliance with Sun Microsystems to finish the implementation of the language
// o	Netscape Navigator 3 was successful with Javascript and thus Microsoft released Internet Explorer
// o	ECMA script create the standard for scripting
// o	It isn’t tied to web browsers and has no methods for input or output
// o	The call stack is where the program keeps track of the sequence of function calls in order to know where to go after a function terminates
// o	Extra parameters given to a function are ignored while missing ones are undefined
// o	A function returns with its surrounding environment
// o	When a property is bound to a function it is called a method
// o	The this keyword is internally defined as a reference variable that holds the location of the object it belongs to


//⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⣤⣤
// ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣤
// ⠀⠀⣶⠀⠀⣀⣤⣶⣤⣉⣿⣿⣤⣤⣀
// ⠤⣤⣿⣤⣿⠿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣀
// ⠀⠛⠿⠀⠀⠀⠀⠉⣿⣿⣿⣿⣿⠉⠛⠿⣿⣤
// ⠀⠀⠀⠀⠀⠀⠀⠀⠿⣿⣿⣿⠛⠀⠀⠀⣶⠿
// ⠀⠀⠀⠀⠀⠀⠀⠀⣀⣿⣿⣿⣿⣤⠀⣿⠿
// ⠀⠀⠀⠀⠀⠀⠀⣶⣿⣿⣿⣿⣿⣿⣿⣿
// ⠀⠀⠀⠀⠀⠀⠀⠿⣿⣿⣿⣿⣿⠿⠉⠉
// ⠀⠀⠀⠀⠀⠀⠀⠉⣿⣿⣿⣿⠿
// ⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⠉
// ⠀⠀⠀⠀⠀⠀⠀⠀⣛⣿⣭⣶⣀
// ⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿
// ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠉⠛⣿
// ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⣿⣿
// ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣉⠀⣶⠿
// ⠀⠀⠀⠀⠀⠀⠀⠀⣶⣿⠿
// ⠀⠀⠀⠀⠀⠀⠀⠛⠿⠛

//         ⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⣿⣿⣿⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣤⣿
// ⠀⠀⠀⠀⠀⠀⠉⣿⣿⣿⣶⣿⣿⣿⣶⣶⣤⣶⣶⠶⠛⠉
// ⠀⠀⠀⠀⠀⠀⣤⣿⠿⣿⣿⣿⣿⣿⠀⠀⠉⠀⠀⠀⠀⠀⠀
// ⠛⣿⣤⣤⣀⣤⠿⠉⠀⠉⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀
// ⠀⠉⠉⠉⠉⠉⠀⠀⠀⠀⠉⣿⣿⣿⣀⠀⠀⠀⠀⠀⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣶⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⠛⠀⠀⠀⠀⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣛⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠀⣶⣿⣿⠛⠿⣿⣿⣿⣶⣤⠀⠀⠀⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠀⣿⠛⠉⠀⠀⠀⠛⠿⣿⣿⣶⣀⠀⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⣿⣀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠿⣶⣤⠀⠀
// ⠀⠀⠀⠀⠀⠛⠿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣿⣿⠿⠀
// ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠉⠉⠀
///////////////////////////////////////////////////////////////////////////////////////////////////////

//Lecture 3

//Starting programming
// JS statement SHOULD end with a semicolon but does not need to
//  - if you use a auto-formatter that compresses things into a single line, it could mess things up


//Types of objects

//	Number
// •	Special – Infinity, -Infinity, NaN (Infinity – Infinity = Nan)
// •	The other obvi ones…


// 	String
// •	3 types: `String`, “String”, ‘String’
// •	Can only use the + operator for JavaScript (concatenation)
// •	Note escape sequences like \n, \t etc.
// •	In order to evaluate an expression you must use back ticks and ${myExpressio}
// o	 =console.log(`${myExpresion}`) = finds the result of myExpression and converts into a string


// 	Boolean
// •	Unary – Negation (!)
// •	Binary-  Logical AND (&&) or OR (||)
// •	Ternary = ( (condition) ? (Return this value if true) : (return this if false)
// o	Also include <, >, <=, >=, !=, ==
// o	 === (ensures type and value are the same), !==


//	Automatic Type Coercion
// •	NOTE: when NaN is part of any operation the result will always be NaN
//              • ^^ This also occurs if you pass a lack of params to a function!


//Try guessing what happens if you run these:

// console.log(8*null);
// console.log("5"-1);
// console.log("5"+1);
// console.log("five" * 2);
// console.log(false == 0);

//If you're doing the following
// (first logical expression || second) << if the first one is TRUE the second one won't run
// (second logical expression && second) << if the first one is FALSE, the second won't run

///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Lecture 4,5 - Program Structure and function declarations

//General info

//o	Binding/Variable
//  	This is used to catch and hold values in JavaScript
//  	The = operator can be used to change existing bindings because JavaScript is a loosely typed language
//  	The let operator can define multiple variables at the same time
//      •	ie. let one = 1, two = 2; console.log(one+two) = 3
//  	var is SIMILAR to let but has some key differences
//      •	if you declare a binding with var in a loop, it will still be considered a global variable
//  	const defines bindings that cannot be changed



//o	Functions
//  	ie.
//             let x = 1;
//             const returnVal = function(x){return x} ;
//             console.log(returnVal(1));
//             //vs
//             const noReturn = function(x){};
//             console.log(noReturn(1))
//      •	note that functions will return “undefined” if the function does not return anything
//  	Functions can be declared after they are called since they are automatically moved to the top of their scope


//3 main way to declare a function

//Declaration notation:
//     function myFunction1(x){
//         return x*x;
//     }

//Standard Binding Notation:
//    const myFunction2 = function(x){
//     return x*x;
// }

//Arrow notation
//     const myFunction3 = (x) => {return x*x};
//     const myFunction4 = x => x*x;
// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ Both do the same thing
//  const NAME = GIVEN A VARIABLE X => DO THIS TO IT AND RETURN


//SOME THINGS TO NOTE


//Passing extra variables
////////////////////////////////////////////////////////////////
//     let square = x => x*x;
//     console.log(square(5,4,3,2,1)); //>> 25
// If you pass extra variables to a function, it ignores them!
////////////////////////////////////////////////////////////////


//Passing less variables than a function is expecting
///////////////////////////////////////////////////////////////////////////
//     let subtract = (a,b) => {if(b==undefined) return -a; else return a-b};
//     console.log(subtract(2,1)); // >> 1
//     console.log(subtract(2));// >> 2
//It will still function!
//If you do not account for the case where b is undefined, it will return NaN
////////////////////////////////////////////////////////////////////////////


//Predefining a paramter from the the start
////////////////////////////////////////////////////////////////////////////////
//     let subtract = (a,b=1) => {if(b==undefined) return -a; else return a-b};
//     console.log(subtract(2,1)); // >> 1
//     console.log(subtract(2));// >> 1
//This time you hardcode the value of b
// If a parameter is passed, the value changes respectively, otherwise it does not!
////////////////////////////////////////////////////////////////////////////////






//Closures - Everyone's favourite thing
///////////////////////////////////////////////////////////////////////////////////////
//TL;DR Closure is a function that has a reference to a private variable

//It allows you to reference a specific instance of a local biding in an enclosing scope

//Lets say you create a juice function

// function Juice(type)
// {
//     var juiceType = type;
// }
//
// let myJuice = new Juice("Orange");

//If you try to reference the juiceType of myJuice, what happens?

// console.log(myJuice.juiceType) // >> Undefined :o

//But... I swear I declared it, on god... Turns out that the juiceType is outside of our scope!

//We need to create a function inside the Juice function to return the type!
// function NewJuice(type)
// {
//     var juiceType = type;
//
//     //Adding closure
//     this.getJuiceType = function(){
//         return juiceType;
//     }
// }
// let myNewJuice = new NewJuice("Apple");
//
// //Tada!!!
// console.log(myNewJuice.getJuiceType());
////////////////////////////////////////////////////////////////////////////////

//Another closure example
// let multiplier = function(factor){
//
//     let innerMultiplier = function(value){
//         return value*factor;
//     }
//     return innerMultiplier;
// }
// let twice = multiplier(2);
// console.log(twice(2))

///////////////////////////////////////////////////////////////////////////////////////////////////////////

//Lecture 6,7: Recursion, Arrays and Objects

// 	Recursive functions – a function that calls itself within a body
//      •	A stopping condition (base case) is required to stop the function from calling itself
//      	Some problems are more easily solved using recursion however other times a loop can be more efficient

// 	Objects consists of two things
//      •	Properties/attributes - description of what the object is
//      •	Methods – description of what the object does

////////////////////////////////////////////////////////////////////////
//ie Object with a arbitrary collection of properties

// let person = {
//     name: "Eric",
//     "average": 51,
//     height: 164
// }
// //Getting the name
// console.log(person.name);
// console.log(person["name"]);
// //Two ways of getting the average
// console.log(person.average);
// console.log(person["average"]);
// //Say you write the stats final and you want to change your average
// person.average= 46;
// //Testing it
// console.log(person["average"]); // >> 46 :(
////////////////////////////////////////////////////////////////////////////


// o	Ie string methods:
//      	.slice(startIndex, endIndex)  - returns substring of string upto and not including the endIndex
//      	.indexOf(“char”) – finds first instance of a given character
//      	.repeat(3) – repeats a string 3 times
//      	.trim() – removes whitespace from string
//      	.split(“ “) – splits a string into an array based on the space between the words
//      	.join(“. “) – puts all the elements of an array together in a string and separates them by a “. “


//•	Arrays -  stores a list of the same objects
// o	Surrounded by square brackets
//      	.push(number) – adds the number to the end of the array
//      	.pop() – removes the last element from an array


//•	Rest Parameters – allow functions to receive any number of arguments and it basically turns it into an array!

///////////////////////////////////////////////////////////
//Ie find the max number in a given series of numbers

// function max(...numbers){
//     let result = -Infinity;
//
//     //for let number of numbers implies that ...numbers is turned into an array
//     for(let number of numbers){
//         if(number>result) result = number;
//     }
//     return result
// }
// console.log(max(4,1,9,-2)); // >> 9
////////////////////////////////////////////////////////


//We have shown an example of a Javascript Object, now lets talk JSON

//Javascript object
// let mjObject ={
//     colour: "red",
//     size: 42,
//     numbers : [1,2,3]
// };
//

//JSON
// {
//     "colour": "red"",
//         "size": 42,
//     "numbers" : [1,2,3]
// }

/////////////////////////////////////////////////////////////////////////////////
//1.    To use a JSON file, we must first turn it into a String

// let myString = JSON.stringify({
//     colour: "red",
//     size: 42,
//     numbers : [1,2,3]
// });
//
// console.log(myString); //>> {"colour":"red","size":42,"numbers":[1,2,3]}
//
// //2. Now that we have it as a string, we can retrieve specific data by using .parse(myString)
// console.log(JSON.parse(myString).numbers);
///////////////////////////////////////////////////////////////////////////////////////////




/////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Lecture 8,9: Higher-Order Functions

//	Higher-Order Functions -  they consist of creating smaller sub-functions to perform a task
//	Abstraction –  hide details and talk about problems at a higher, more abstract level
//      •	Often times a program does something a set amount of times and we can use a loop to make this happen or we can abstract it in a function
//      •	Abstraction makes code easier to read and less prone to bugs


///////////////////////////////////////////////////////////////////////////////
//ie

//This
// for(let i = 0 ; i < 10; i++){
//     console.log(i);
// }
//
// //Can abstracted to
//
// //1. Repeatting an action
// function repeat(n, action){
//     for(let i=0; i<n;i++){
//         action(i);
//     }
// }
// console.log("")
//
// //2. Outputting it
// function output(input){
//     console.log(input);
// }
//
// repeat(10, output)

/////////////////////////////////////////////////////////////////////////////////


// 	To Transform datasets you use
//      o	Filter - based on the function provided, it takes out elements from an aray
//      o	Map - transforms each element in an array and returns the new array with the transformed elements
//      o	Fold/Reduce - returns a value by taking elements from an array and performing operations to them

///////////////////////////////////////////////////////////////////////////////////
// //FILTER


// function filter(array, test){
//     let passed = [];
//     for(let element of array){
//         if (test(element)){
//             passed.push(element)
//         }
//     }
//     return passed;
// }
//
// //Declaring the filtered and unfiltered array
// let unfilteredArray = [1,2,3,4,5,6,7,8,9,10];
// let filteredArry = filter(unfilteredArray, a => a>5)
// //                                         ^^ return a given a is greater than 5
//
// //Output
// console.log(filteredArry); //>>[ 6, 7, 8, 9, 10 ]

///////////////////////////////////////////////////////////////////////////////////////////////
//MAP

// function map(array, transform){
//     let mapped = [];
//     for(let element of array){
//         mapped.push(transform(element)); //The new mapped array elements will depends on the tranform function
//     }
//     return mapped;
// }
//
// //This will be the input array
// let unmappedArray  = [1,2,3,4,5,6,7,8,9,10];
//
// //mapping the array
// console.log(map(unmappedArray, a => a*2)); //>>[ 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 ]
// //                                     ^^This function will multiply each element by 2

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// //REDUCE
//
// function reduce(array, combine, start){
//     let current = start;
//     for(let element of array){
//         current = combine(current, element)
//     }
//     return current;
// }
//
// //This will be the input array
// let unreducedArray  = [1,2,3,4,5,6,7,8,9,10];
//
// console.log(reduce(unreducedArray, (a,b) => a+b, 0)); //notice that the start is an actual element, not an index

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Composability = composing functions together to get a result simply mean combining them together

//This wont run but as an example:

//console.log(Math.round(average(SCRIPTS.filter(s=>s.living).map(s=> s.year)))) //What does this dooooo?

//Breaking it down
//console.log(Math.round(average
// (SCRIPTS.filter(s=>s.living)
// .map(s=> s.year))))

// 1. Recognize the program wants to find the average of a array of something
// 2. First it filters the SCRIPTS to see which one are living
// 3. Out of the living ones, it extracts their year
// 4. Now that you have an array of the years, of the scripts that are living, the average function can work

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Lecture 10.1: Using .this

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Lecture 10: Methods and using the "this" binding

//	Methods – properties that hold function values

// 	There are 2 ways of calling methods from an object:

// 1.	Explicitly
// hungryRabbit.speak("I could use a carrot right now."

// 2.	Using the call method
// speak.call(hungryRabbit, "Burp!")


// .this

// Usually a method needs to do something with the object it was called on
// When a function is called as a method -looked up as a property and immediately called
// as in object.method() - the binding called this in its body automatically to the object
// it was called on.

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Lecture 12, 13 - Prototypes and Classes

//  oPrototype – a object which is used as a fallback source of properties
//      •	When an object gets a request for a property that it does not have,
//          its prototype will be search for the property, then the prototypes prototype and so on.

//	Constructor function – is a template to hold the prototype of an object

// ie
// function makeRabbit(type){
//     let rabbit = Object.create(protoRabbit);
//     rabbit.type  = type;
//     return rabbit;
// }

//  	Since each prototype is in itself a prototype of another prototype, JavaScript objects
//      form a tree-shaped structure and at the root of each tree sits Object.prototype


///////////////////////////////////////////////////////////////////////////////////////
// //Prototype Practice
//
// //Suppose you have the following prototype:
// let coursePrototype = {
//     name:"",
//     classroom:"",
//     homeworkGrades: [],
//
//     printGrades: function(){
//             console.log(this.homeworkGrades);
//     }
// };
//
// // How would you instantiate it?
//
// //Method 1: Using the .create method
// let course1 = Object.create(coursePrototype);
// course1.name = "Scripting";
// course1.homeworkGrades = [52,45,20];
// course1.printGrades();
//

//Method 2: Using the new method
//let course2 = new Course("Javascript", "3", "45) // NOTE: this example des not contain the course class
// You can only use "new" for prototypes if its a function!

///////////////////////////////////////////////////////////////////////////////////////////////////////////////

//o	Classes –   uses JavaScript’s prototype system can be interpreted
//              as a somewhat informal take on the OOP concept classes
//          -   we use the keyword class for declreation

//////////////////////////////////////////////////////////////////
////ie
//
// class Rabbit{
//     constructor(type){
//         this.type = type;
//         this.name= "default name";
//         this.printName = function(){console.log(this.name)};
//     }
//     speak(line){
//         console.log(`The ${this.type} rabbit says ${line}`)
//     }
// }
//
// let killerRabbit = new Rabbit("Killa");
//
// //Adding things to the rabbit
// killerRabbit.speed = 45;
// console.log(killerRabbit.speed);


//NOTE: Inside a class decleration, methods that have static written before them are stored on the contructor
//ie
// class Temperature{
//     constructor(celsius){
//         this.celsius = celsius;
//     }
//
//     static fromFahrenheit(value){
//         return new Temperature((value-32)/1.8);
//     }
// }

//^^ This allows you to write Temperature.fromFahrenhet(100) to create a temperature using Fh
////////////////////////////////////////////////////////////////////////



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Lecture 14,15: ez stuff

// If we want to inherit properties of another prototype, we need to extend it
//ie
// class Rabbit extends Animal{
//     constructor(...args){
//         super(...args);
// }
// }
//Note that if we don't explicitly define a contructor, a default one will be generated


//If we want to override the default constructor, we have to call the parent's construtor
// Otherwise, you get an error when creating the object :

//ie
// class Rabbit extends Animal{
//     constructor(name, earLength){
//         super(name);
//         this.earLength = earLength;
//     }
// }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Lecture 15: Bugs and Errors

//The term "bug" encompases the following problems:
//  Error: the difference between what was expected and what is observed
//  Defect/Fault: the original problem in the code that caused the error
//  Mistake: The human error that led to the fault

//We discover bugs when we observe a difference between what's expected and what actually happens
//Testing: the process of running the program with controlled input so that we can compare teh expected with the observed

//Javascript is very flexible as it allows for risky code to be executed without complaints
// By adding "use strict", the program may break

////////////////////////////////////////////////////////////////////
//ei
// function canYouSpotTheProblem(){
//     for(counter = 0; counter <10;counter++){
//         console.log("TAAMJESR");
//     }
// }
//  canYouSpotTheProblem();
//
// //^^If we dont use the keyword let or var, a global binding will be automatically created
//
// //HOWEVER
//
// function canYouSpotTheProblem(){
//     "use strict";
//     for(counter = 0; counter <10;counter++){ // NOW COUNTER IS BIG MAD >:(
//         console.log("TAAMJESR");
//     }
// }
// canYouSpotTheProblem(); //Reference error, counter is not defined


//Use strict is especially usefull to protect from problems with using the .this keyword
//////////////////////////////////////////////////////////////////////////////////////////


/////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Lecture 16, 17: Hoisting & IIFE

//o	Hoisting
//      	JavaScript Declarations are Hoisted
//        	In JavaScript, a variable can be declared after it has been used.
//      	In other words; a variable can be used before it has been declared
//
//      	Declarations are hoisted to the top in other words this:

// console.log(definedLater); >>undefined
// var definedLater;
// definedLater = "I am defined"

// // is equivalent to
// var definedLater;
// console.log(definedLater); >>undefined
// definedLater = "I am defined"


//	Either way, the output is undefined, and the output will be
//    undefined as the variable is assigned after  it is calle
// Only the decleration is hoisted :o




//IIFE - Immediately INvoked Function Expressions - a function that runs on execution
//ie
// (function(){
//     console.log("My favourite number is 3")
// }) ();

//This function is not stored in a variable!
//The last 2 parenthese tell the compiler to invoke the anonymous function



//Example of a closure
// var a = 2;
//
// (function(){
//     var a= 3;
//     console.log(a);
// })();

// console.log(2);
//                  >> This code will output 3, 2


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Lecture 18 - Introduction to Modules

//  o	Modules: allow us to organize code into separate reusable pieces which are protect/encapsulated
// •	2 PARTS:
// •	1) EXPORTING
//          module.exports = nameOfTheFile;

// •	2) IMPORTING
//       let objectName = require('/.nameOfTheFile');

//      3)Using
//       myVar = objectName(param1, param2);


// •	By reason it allows us to split the code into separate files where one represents the main program
// •	NOTE: The js import part is optional
// •	We can use class notation as modules

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Lecture 19: Asynchronous Programming

//The problem with synchronous code is that things happen one at a time
// In order for one thing to start, another must end!
//To solve this problem, we create additional threads of control

// o	Thread: another running program whose execution may be interweaved with other programs
// o	Sidenote: multi-threading requires context switching which can become very costly
// o	Callback function – any function that is passed as an argument. It is executed after another function has finished executing
// o	Higher-order function – function that take functions as argument and can be retirned by other functions


//ie
// function doHomework(subject, callback){       //We allow the function to be received as an arg
//     console.log(`starting my${subject} homework`);
//     callback(); //We execute the "callback" function in the right place
// }
//
// function submitAssignment(){
//     console.log("Submitting the homework assignment");
// }
//
//
// doHomework("Javascript", submitAssignment); // We send it as an argument to the other func


//You can also set a timout for things
//ie
//setTimeout(() => console.log("Wait for a second"), 1000);






//////////////////////////////////////////////////////////////////////////////////////////////////

//Lecture 20 - Promises

//Suppose you want to add a file to your current program but you want to make sure you're handling for any errors
// But the code you're running is asynchronous

//In order to account for something that may or may not happen, we use promises

//Promise - attempt to execute a block of code
//Promise:fulfilled = the resolve function is called
//Promist:unfulfilled = the reject function is called

//ie

//The promise class takes a callback function which accepts two parameters
// let somePromise = new Promise(function(resolve,reject) {
//     let fulfilled = false;
//     if(fulfilled){resolve("fulfilled")}
//     else{reject("Not fulfilled")}
// });


//Any function that we want to run in the event of a success, is sent as a callback to the then method
//let promiseAfterThecall = somePromise.then(function(result){
// console.log("The promise was:" + result})

// promiseAfterThecall.catch(function(result){ //This runs in the even of a failure
//     console.log("The promise was:" + result)
// })




//However often times people don't create bindings for the failure promise, they call catch right away
//ie
//Resolve represents whatever function is inside the .then
// vice-versa for the reject!

//If fulfilled is true, you run resolve(then)

// let somePromise = new Promise(function(resolve,reject) {
//     let fulfilled = false;
//     if(fulfilled){resolve("fulfilled")}
//     else{reject("Not fulfilled")}
// });
//
//
// somePromise
//     .then(function (result){console.log("The promise wasnt not not not " + result)})
//     .catch(function(result){console.log("The promise wasnt" + result)}
// );
