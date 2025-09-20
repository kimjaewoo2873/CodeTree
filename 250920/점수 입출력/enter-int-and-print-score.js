const fs = require("fs");
let N = fs.readFileSync(0).toString();
N = Number(N);
console.log(`Your score is ${N} point.`);