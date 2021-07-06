/* 
I made this file cuz java uses a different console statement and i couldnt just
go on changing from js to java so i made it ez
*/

class out {
    static println(value) {
        return console.log(value + '\n')
    }
    static print(value) {
        console.log(value)
    }
}

module.exports.out = out