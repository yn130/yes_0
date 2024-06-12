//////// 구조분해 할당
// const { log } = require("console");

const { log } = require("console");

// const arr1 = [1, 2, 3, 4, 5];
// const arr2 = ['a', 'b', 'c'];

// const [one, two, three, four, five] = arr1;
// console.log(one, two, three, four, five);

// const [x, y, z, alpha] = arr2;
// console.log(x, y, z, alpha);


//////// 변수 값의 교환 : 그전에는 2개의 변수 값을 교환할 때에 제 3의 변수를 사용했어야 했음. 그러나 지금은 새로운 문법이 등장해 그럴 필요 없음 
// let num1 = 1;
// let num2 = 2;
// console.log('Before : ', num1, num2);
// [num2, num1] = [num1, num2];
// console.log('After : ', num1, num2);


//////// 자리에 디폴트값을 지정 
// const lists = ['apple', 'grape'];
// [f1, f2, f3='orange'] = lists;
// console.log(f1, f2, f3);


//////// 객체, object : key와 value로 이루어진것, 객체의 값을 줄 때에는 {}(중괄호) 사용
// const obj = { 
//     title : '엘리먼트',
//     content : 'fun',
//     num : 5
// }
// console.log(obj.num);  // .표기법 
// console.log(obj.title);
// console.log(obj.content);
// console.log(obj['num']);
// console.log(obj['title']);
// console.log(obj['content']);

// 객체 구조 분해 

// const {num, title, content, star=1000} = obj;
// console.log(num, title, content, star);

// const {a1, b1, c1} = obj; // 같은 이름을 사용해야 한다. 
// console.log(a1, b1, c1); // 결과는 undefined

//undefined :변수는 할당되었지만 (초기화), 값이 할당x 

const lectureInfo = {
    name : 'Coding On',
    part : 'Web',
    leader : 'Kim',
}
// console.log(lectureInfo);
function getInfo(lecture){
    const {name, part, leader} = lecture;
    const output = `${name} 강의는 ${part} 개발을 공부합니다. 수업의 리더는 ${leader} 입니다.`
    return output;
}

const result  = getInfo(lectureInfo);
console.log(result);