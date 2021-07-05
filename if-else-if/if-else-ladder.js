/* 
a grade checker
*/
const System = require('../System/out')
// For java we have the main class

class Main {
    constructor(name) {
        this.input = name
    }

    get grade() {
        if (this.input < 25) {
            System.out.println("You are a failure")
        } else if (this.input > 25 && this.input < 45) {
            System.out.println("You are of the E Class")
        } else if (this.input > 45 && this.input < 50) {
            System.out.println("You are of the D class")
        } else if (this.input > 50 && this.input < 60) {
            System.out.println("You are of the C Class")
        } else if (this.input > 60 && this.input < 80) {
            System.out.println("You are of the B Class")
        } else if (this.input > 80 && this.input <= 100) {
            System.out.println("You are of the A class")
        } else {
            System.out.println('No correct marks given')
        }
    }
}

const mainprototype = new Main(1);
mainprototype.grade