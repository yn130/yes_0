const express = require('express');
const session = require('express-session');
const dotenv = require('dotenv');
const path = require('path');

dotenv.config({
    path: path.resolve(__dirname, '.env'),
}); 

const app = express();
const port = process.env.PORT; 

app.set('view engine', 'ejs');
app.set('views', './views');


// express - session 미들웨어 
app.use(session({
    secret: process.env.COOKIE_SECRET, // 필수 옵션 : 세션을 암호화 하는데 쓰는 키 
    resave: false, // 세션이 변경되지 않더라도 매번 다시 저장할 건지를 설정
    saveUninitialized: false, // 세션을 초기값이 지정되지 않은 상태에서도 처음부터 세션을 생성할 건지

    // 세션 쿠키 설정(세션 관리할 때 클라이언트로 보내는 쿠키
    cookie: {
        httpOnly: true, // 클라이언트에서 쿠키 확인 x
        secure: false, // http에서 사용 가능하도록(true라면 https에서만 가능)
        maxAge: 60* 1000, // 단위(ms) 
        // expires: 만료기간 설정
    }
}))
// 인자로 세션에 대한 설정 객체를 넣음 

app.get('/', (req,res)=> {
    res.render('session');
})

app.get('/set', (req,res) => {
    // 세션 설정
    // req.session.키  = 값;

    // req.session.name = '바나나';
    // req.session.age = 10;

    // if(req.query) {
    //     // http://127.0.0.1:5000/set?name=사과&age=1
    //     req.session.name = req.query.name;
    //     req.session.age = req.query.age;
    // } else {
    //     req.session.name = '바나나';
    //     req.session.age = 10;
    // }

     // console.log(req.query) // {}, {name: x, age: y}
     if (req.query.name) {
        req.session.name = req.query.name;
        req.session.age = req.query.age;
    } else {
        req.session.name = '바나나';
        req.session.age = 10;
    }

    // { [sid]: { name: '바나나', age: 10 }, [sid2]: { name: '바나나', age: 10 }}
    res.send('세션 설정 완료!');
})

app.get('/name', (req, res) => {
    // 세션 사용(조회)
    // req.session.키
    console.log('req.session이 뭐야? >>',req.session);
    res.send({id: req.sessionID, name: req.session.name})
})


app.get('/destroy', (req,res) => {
    // 세션 삭제 : req.sesion.destroy(세션 삭제시 호출할 콜백 함수)

    req.session.destroy((err) => {
        if(err) {
            throw err       
        }
        // res.send('세션 삭제 완료!')
        res.redirect('/name'); // 경로를 변경한다! 

    })

})


app.set('view engine', 'ejs');
app.set('views', './views');

app.listen(port, () => {
    console.log(`Sever is running! The port number is ${port} ...`);
});

//express - session 모듈
// : 세션 관리 ex) 로그인 등 세션을 구현하거나 특정 클라이언트에 대한 데이터를 저장할 때 사용
// -> 사용자 별로 req.session 객체 안에 유지

// 세션! 
// 1. 세션 사용 : req.session.키
// 2. 세션 설정 : req.session.키 = 값
// 3. 세션 삭제 : req.destory(콜백)