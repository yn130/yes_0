const express = require('express');
const jwt = require('jsonwebtoken');
const session = require('express-session')
const app = express();
const PORT = 8000;
const SECRET = 'aLOpQU4GmYy8GxiyBNF6AnYW3Z1HP6hW'

const userInfo = {id:'yeye', pw:'1234', name: 'seo'}

app.set('view engine', 'ejs');
app.use(express.urlencoded({extended:true}))
app.use(express.json());

app.use(
    session({
        secret: SECRET,
        resave: false,
        saveUninitialized: false,
        cookie: {
            httpOnly: true,
            secure: false,
            maxAge: 5*1000,

        },

    })
)

app.get('/', (req, res) => {
    if(req.session.user) {
        const token = req.session.user.token;
        console.log('token >>> ', token);

        try {
            const result = jwt.verify(token, SECRET);
            console.log('result >>>', result);

            if(result.id === userInfo.id){
                res.render('index2', {name:req.session.user.name})
            } else {
                res.redirect('/login')
            }
        } catch (error) {
            console.error('인증된 회원이 아닙니다.', error);
            
        }
    } else (
        res.redirect('/login')
    )
});

app.get('/login', (req, res) => {
    res.render('login')
});

app.post('/login', (req, res) => {
    try {
        const {id, pw} = req.body;
        const { id: uId, pw:uPw} = userInfo;

        if(id === uId && pw === uPw ) {
            const token = jwt.sign( {id}, SECRET)
            console.log('로그인 token >>>>', token);

            req.session.user = { id, name: userInfo.name, token};
            res.json({result:true, token})
        }else{
            res.json({
                result: false,
                message: '로그인 정보가 올바르지 않습니다.'
            });
        }
    } catch(error) {
        console.log(error);
    }
});

app.get('/logout', (req,res) => {
    req.session.destroy();
    res.redirect('/login')
})







app.listen(PORT, () => {
    console.log(`http://localhost:${PORT}`);
});
