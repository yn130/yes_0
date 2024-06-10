// 파일 생성

const fs = require('fs');

// fs.readFile('./input.txt', 'utf-8',function (err, data) {
//     console.log(data)
// })
// console.log(('파일 읽기 완료'));

// fs.readFile('./input.txt',function (err, data) {
//     console.log(data)
// })
// console.log(('파일 읽기 완료'));


const data = fs.readFileSync('./input.txt','utf-8')
console.log((data));
console.log(('파일 읽기 완료'));   /// 파일 읽는 순서 먼저 처리 x, 블로킹