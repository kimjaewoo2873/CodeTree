const fs = require("fs");
let input = Number(fs.readFileSync(0).toString().trim());
if(input >= 80) {
    console.log("pass");
} else {
    let n = 80 - input;
    console.log(`${n} more score`);
}