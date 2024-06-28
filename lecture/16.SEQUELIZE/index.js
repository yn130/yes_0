const express = require('express');
const app = express();
const PORT = 8000;
const router = require('./routes/index');
const { sequelize } = require('./models/index')

app.set('view engine', 'ejs');
app.set('views', './views');
app.use(express.urlencoded({ extended: true}));
app.use(express.json());

app.use('/', router);

sequelize 
    .sync({ force: true})
    .then(() => {
        app.listen(PORT, () => {
            console.log('Databaxe connection successed!');
            console.log(`Server is running! Port number is ${PORT} ...`);
        })
    })
    .catch((err) => {
        console.error(err);
    })


