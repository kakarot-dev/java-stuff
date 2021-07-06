/* 
for loop
*/
const System = require('../System/out')
// For java we have the main class

class Main {
    constructor(input) {
        this.input = input;
    }
    table(num) {
        // System.out.println("Enter any positive integer: ");
        // num = console.nextInt();

        System.out.println("Multiplication Table of " + num);

        for (let i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

const mainprototype = new Main();

mainprototype.table(123456787654321)