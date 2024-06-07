const http = require('http');
http.createServer(function (req, res) {
    res.writeHead(200, {'content-Type':'text/html'})
    res.end('<h2>seo ye eun</h2>')
}).listen(3000,function(){
    console.log('3000번 포트에서 실행 중');
});


// const http = require('http');
// http.createServer(function(req, res){
//     var _url = req.url;
//     res.writeHead(200, {'content-Type':'text/html'});
//     res.write('<h2>hello</h2>');
//     res.end(`<p>${_url} </p>`)

// }).listen(8000,()=>{
//     console.log('서버실행')
// })