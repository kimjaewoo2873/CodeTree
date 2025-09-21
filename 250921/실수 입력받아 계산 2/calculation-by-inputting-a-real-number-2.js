const fs = requires("fs");
let a = fs.readFileSync(0).toString();
a = Number(a);
console.log(a.toFixed(1));