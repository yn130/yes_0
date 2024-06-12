const express = require('express');
const app = express();
app.set('view engine','ejs');
app.set('views','./views');
app.use(express.static('public'))



app.get('/', (req,res)=>{
    res.render('index', {title :'HOME'})
})

app.get('/about', (req,res)=>{
    res.render('about', {title :'ABOUT'})
})

app.get('/create', (req,res)=>{
    res.render('create', {title :'CREATE'})
})



// 지정된 경로와 다른 경로일 때 
app.use((req,res)=>{
    res.status(404).render('404');
});


app.listen(8000, ()=>{
    console.log('http://localhost:8000');
});