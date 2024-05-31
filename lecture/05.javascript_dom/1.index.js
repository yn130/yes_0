 let num = 1;
 let num2 = num;
 console.log(num, num2);
 console.log(num === num2);


 num = 5;
 console.log(num, num2);
 console.log(num === num2);

 function changeValue(x) {
    x = 10;
    console.log('x > ', x);

}
changeValue(num);
console.log("num > ", num);