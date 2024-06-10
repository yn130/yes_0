// 디렉토리 읽기

const fs = require('fs');
// fs.readdir('./', function(err, files){
//     if(err) console.log('에러', err)
//     else console.log("결과는", files);  
// })  //결과는 [ '.DS_Store', '1.app.js', '2.app.js', 'demo', 'pratice.js' ]


// 파일 생성 (내용이 있는 파일)

// fs.writeFile('myNewFile1.txt', 'Hello world', function(err){
//     if(err) throw err;
//     console.log('파일이 생성됨');
// })

// open(), w를 이용해서 파일 생성 (내용이 없는 빈 파일)

// fs.open('myNewFile2.txt', 'w', function (err, file) {  // w => 컨텐츠가 없는 빈 파일 
//     if(err) throw err;
//     console.log('파일이 생성됨');
    
// })

// 파일 생성 appendFile() : 기존 파일을 전제로 파일 추가 

fs.appendFile('myNewFile1.txt', 'seo', function(err){
    if(err) throw err;
    console.log('파일이 생성됨');  
})  ///// myNewFile1.txt파일에 내용이 추가됨 