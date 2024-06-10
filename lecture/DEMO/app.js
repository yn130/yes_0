const http = require('http');
const url = require('url');
const fs = require('fs');

// 127.0.0.1:3000포트로 접속 
// http.createServer().listen(3000, function(){
//     console.log('3000 포트 실행 중');
// })

// 사용자 요청을 통해 서버
http.createServer(function(req, res){
    //req에 사용자가 원하는 파일(3000/ 뒤에 적혀진 것) 적용됨
    var q = url.parse(req.url, true);
    var filename = '.'+q.pathname;

    fs.readFile(filename, function (err, data){
        // if(err){
        //     res.writeHead(404, {'Content-type': 'text/html'})
        //     return res.end('404 Not found')
        // }

        res.writeHead(200, {'Content-type':'text/html'});
        res.write(data)
        return res.end();    
    })

}).listen(3000, function(){
    console.log('3000 포트 실행 중');
})