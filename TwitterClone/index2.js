var express = require('express');
var bodyParser =  require('body-parser');
var mongoose = require('mongoose');
// var encrypt = require('mongoose-encryption');
require('dotenv').config();
 
const md5 = require('md5') ;

const app = express();
const port = 3000;



mongoose.connect('mongodb://localhost:27017/tweetDB');
app.use(express.static('public'))
app.set('view engine','ejs')
app.use(bodyParser.urlencoded({extended:false}));


const userSchema=new mongoose.Schema({
    name: String,
    email:String,
    password:String
});


// userSchema.plugin(encrypt, { secret: process.env.SECRET, encryptedFields: ['password']});

const User = new mongoose.model('User',userSchema)

app.get('/',(req,res)=>{
    res.render('index')
});

app.get('/login',(req,res)=>{
    res.render('login')
});
app.post('/login',(req,res)=>{
    const email = req.body.email;
      const password = md5(req.body.password);

      User.findOne({email:email}).then((foundUser) => {
        if(foundUser){
            if(foundUser.password == password){
                res.redirect('/tweets')
            } else{
                res.redirect('/login')
            }
          }else{
            res.redirect('/login')
          }

      })

    });
  



app.get('/register',(req,res)=>{
    res.render('register')
});
app.post('/register',(req,res)=>{
    const newUser= new User({
        name: req.body.name,
        email: req.body.email,
        password: md5(req.body.password)

    });
    newUser.save();
    res.redirect('/tweets');
});


app.get('/tweets',(req,res)=>{
    res.render('tweets')
});

app.listen(port,()=>{
    console.log("My first express project is live");
})