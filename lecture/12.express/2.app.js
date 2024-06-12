const express = require('express');
const app = express();
const PORT = 3000;

app.set('view engine','ejs');
app.set('views','./views')

app.get('/', function (req, res) {
    res.render('index', {title:'홈'})
})
app.get('/about', (req,res)=>{
    res.render('about', {title:'소개'})
})
app.get('/create', (req,res)=>{
    res.render('create', {title:'적성'})
})

app.listen(PORT,()=>{
    console.log('3000 포트 실행 중');
})
