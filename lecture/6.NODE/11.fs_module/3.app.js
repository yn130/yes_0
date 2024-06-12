const fs = require('fs');


// 파일 삭제 
// fs.unlink('myNewFile2.txt', function(){
//     console.log('파일 삭제 완료')
// })


// 파일 이름 변경 
fs.rename('myNewFile1.txt', 'renameFile1.txt', function(err){
    if(err) throw err;
    console.log('파일이름 변경 완료');
})

