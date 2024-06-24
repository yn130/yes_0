const express = require('express');
const app = express();
const PORT = 8000;

app.set('view engine', 'ejs');
app.set('views', './views'); 

app.get('/', (req,res)=>{
    res.render('index')
})

const userRouter = require('./routes/user');
app.use('/user', userRouter);
// -> 기본 요청 주소: "localhost:PORT/user"

// 404 
app.get('*', (req, res) => {
    res.render('404');
});

app.listen(PORT, ()=> {
    console.log(`http://localhost:${PORT}`);
});
