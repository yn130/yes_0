const express = require('express');
const multer = require('multer'); // multer 모듈 불러오기
const path = require('path');
const app = express();
const PORT = 8000;

app.set('view engine', 'ejs');
app.set('views', 'views');

app.use(express.urlencoded({ extended: true }));
app.use(express.json());
app.use('/uploads', express.static(__dirname + '/uploads'));

    const uploadDetail = multer({
        storage: multer.diskStorage({
            destination(req, file, done) {
                done(null, 'uploads/'); 
            },
            filename(req, file, done) {
                const userId = req.body.id
                const ext = path.extname(file.originalname);
                done(null, userId + ext);
            }
        }),
        limits: { fileSize: 5 * 1024 * 1024 } 
    })


app.get('/', function (req, res) {
    res.render('index');
});

app.post("/upload", uploadDetail.single('userfile'), (req, res) => {
    console.log(req.body); 
    console.log(req.file);
;
    res.render('result', { src: req.file.path, userInfo: req.body});

});

app.listen(PORT, function () {
    console.log(`http://localhost:${PORT}`);
});