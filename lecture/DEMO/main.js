// const http = require('http');
// const url = require('url');
// const fs = require('fs');

/**
//  * url 모듈은 웹주소를 읽어온다. 
//  * 읽어온 내용을 구문분석하여 주소의 각 부분으로 나누고 객체를 변환한다.
//  * */ 

// // var addr = 'http://localhost:8000/example.html?year=2024&month=feb'; 
// // // ? 뒤부터는 querty임 / & 기호로 구분함 
// // var q = url.parse(addr, true)
// // console.log(q);
// // console.log(q.pathname); ///example.html : 경로와 파일이름 
// // console.log(q.search); //?year=2024&month=feb : 
// // var qdata = q.query; 
// // console.log(qdata); //[Object: null prototype] { year: '2024', month: 'feb' }
// // console.log(qdata.month); //feb : 기존 쿼리에서 month에 해댕하는 것만 출력 



// var addr = 'http://localhost:8000/demo.html?id=2024&pw=feb'; 
// // ? 뒤부터는 querty임 / & 기호로 구분함 
// var q = url.parse(addr, true)
// console.log(q);
// console.log(q.pathname); ///example.html : 경로와 파일이름 
// console.log(q.search); //?year=2024&month=feb : 
// var qdata = q.query; 
// console.log(qdata); //[Object: null prototype] { year: '2024', month: 'feb' }
// console.log(qdata.month); //feb : 기존 쿼리에서 month에 해댕하는 것만 출력 


/////////////////////////////////////////////////////////////////////////////////////

const http = require('http');
const url = require('url');
const fs = require('fs');
http.createServer(function(req, res){
    var q = url.parse(req.url, true);
    var filename = '.'+q.pathname;
    console.log(filename);

    fs.readFile(filename, function (err, data){
        if(err){
            res.writeHead(404, {'Content-type': 'text/html'})
            return res.end('404 Not found')
        }

        res.writeHead(200,{'Content-type': 'text/html'})
        res.write(data);
        return res.end(); 
    })

}).listen(8000, ()=> {
    console.log('8000 서버 실행중');
})