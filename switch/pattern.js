/* 
for loop
*/
const System = require('../System/out')
// For java we have the main class

class Main {
    constructor(input) {
        this.input = input;
    }
    pattern(num) {
        // System.out.println("Enter any number between 1 and 3..... ");
        // num = console.nextInt();
        switch (num) {
            case 1:
                let i = 0
                for (i = 0; i < 5; i++) {
                    System.out.print(" ");
                }
                for (let j = 0; j <= i; j++) {
                    System.out.print("* ");
                }

                System.out.println(' ');
        }
    }

}

const mainprototype = new Main();

mainprototype.pattern(1)