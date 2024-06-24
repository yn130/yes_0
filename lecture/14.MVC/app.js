const express = require('express');
const app = express();
const PORT = 8000;

app.set('view engine', 'ejs');
app.set('views', './views'); 

const indexRouter = require('./routes/index');
app.use('/', indexRouter);


// 404 
app.get('*', (req, res) => {
    res.render('404');
});

app.listen(PORT, ()=> {
    console.log(`http://localhost:${PORT}`);
});