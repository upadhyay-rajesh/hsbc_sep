"use strict";
function greet(name) {
    console.log('Hello ' + name);
}
function greet1(name) {
    console.log('Hello1 ' + name);
}
module.exports = { a: greet, b: greet1 };
