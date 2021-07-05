/* 
a grade checker
*/

// For java we have the main class

class Main {
    constructor(name) {
        this.input = name
    }

    get grade() {
        if (this.input < 25) {
            console.log("You are a failure")
        } else if (this.input > 25 && this.input < 45) {
            console.log("You are of the E Class")
        } else if (this.input > 45 && this.input < 50) {
            console.log("You are of the D class")
        } else if (this.input > 50 && this.input < 60) {
            console.log("You are of the C Class")
        } else if (this.input > 60 && this.input < 80) {
            console.log("You are of the B Class")
        } else if (this.input > 80 && this.input <= 100) {
            console.log("You are of the A class")
        } else {
            console.log('No correct marks given')
        }
    }
}

const mainprototype = new Main(145);
mainprototype.grade