///////////////////////////////////////3.m1 ///////////////////////////////////////


// const add = require('./3.m1');
// console.log(add(1,3));

///////////////////////////////////////3.m2 ///////////////////////////////////////

// const math = require('./3.m2');
// console.log(math.add(1,3));
// console.log(math.subtract(11,3));

///// 위와 같은 코드. 새로운 문법 !  ////


const math = require('./3.m2');
const {add,subtract} =math;
console.log(add(1,3));
console.log(subtract(11,3));

///////////////////////////////////////

