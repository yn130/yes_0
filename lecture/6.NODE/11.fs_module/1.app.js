const fs = require('fs');
// console.log(fs)

// 형식 : fs.mkdir(parh, mode, callback)


/// v파일 생성 
const path = require('path');
fs.mkdir(path.join(__dirname,'test'), (err)=> {
    if(err) {
        return console.error(err);
    } 
    console.log('디렉토리 생성완료');
})

/////// 파일 삭제
// fs.rmdir(path.join(__dirname,'test'), (err)=> {
//     if(err) {
//         return console.error(err);
//     } 
//     console.log('디렉토리 삭제완료');
// })