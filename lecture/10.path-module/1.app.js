// const { log } = require('console');
// const os = require('os');
// console.log(os);
// console.log(os.totalmem());

// let tatalMemory = os.totalmem();
// let freeMemory = os.freemem();
// console.log('total memory : ${totalMemory}');
// console.log('free memory : ${freelMemory}');   ????? 백틱으로 다시 해보기! 



////////////////////////////////////////////////////////////////////////////////////////


// path.join() : 여러 인자를 넣으면 하나의 경로로 합쳐준다
// path.resolve() : path.join()과 비슷하지만 약간의 차이 
// path.parse() : 파일 경로를 root, dir, base, ext, name으로 구분 
// path.format(): path.parse()한 객체를 파일 경로로 합친다

const path = require('path');
// console.log(abc);
// console.log(__dirname);
// console.log(__filename);
console.log(path.basename(__dirname));
console.log(path.basename(__filename));
console.log(path.join('a','b','index.html'));

console.log('------------------------------------');

let pathname = path.parse('/home/user/dir/file.txt')  //  내용을 객체로 분석
console.log(pathname);

console.log('------------------------------------');

console.log(path.extname('/home/user/dir/file.txt'));  /// 확장자 이름
console.log(path.basename('/home/user/dir/file.txt'));  /// 파일 이름 