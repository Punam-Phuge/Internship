var express = require('express');
var bodyParser =  require('body-parser');
var mongoose = require('mongoose');
// var encrypt = require('mongoose-encryption');
require('dotenv').config();
var session = require('express-session')
var passport = require('passport')
const passportLocalMongoose = require('passport-local-mongoose');
const { name } = require('ejs');
//const md5 = require('md5') ;
//const timestamps = require('mongoose-timestamp');

const app = express();
const port = 3000;


mongoose.connect('mongodb://localhost:27017/tweetDB');
app.use(express.static('public'))
app.set('view engine','ejs')
app.use(bodyParser.urlencoded({extended:false}));

app.use(session({
    secret: process.env.SECRET,
    resave: false,
    saveUninitialized: false
  }));

app.use(passport.initialize());
app.use(passport.session());

const userSchema=new mongoose.Schema({
    name: String,
    email:String,
    password:String,
    tweets:[{
        _id : false,
        tweet:String,
        name:String,
        timestamps: Date}]
});
userSchema.plugin(passportLocalMongoose);

// userSchema.plugin(encrypt, { secret: process.env.SECRET, encryptedFields: ['password']});

const User = new mongoose.model('User',userSchema)

passport.use(User.createStrategy());


passport.serializeUser(function(user, done) {
    done(null, user);
});
  
passport.deserializeUser(function(user, done) {
    done(null, user);
});

// passport.serializeUser(User.serializeUser());
// passport.deserializeUser(User.deserializeUser());

app.get('/',(req,res)=>{
    res.render('index')
});

app.get('/login',(req,res)=>{
    res.render('login')
});
app.post('/login', (req, res) => {
    const user = new User({
        name: req.body.name,
        username: req.body.username,
        password: req.body.password
    });
 
    req.login(user, function(err) {
        if(err) {
            res.redirect("/login");
        } else {
            passport.authenticate("local", { successRedirect: 'tweets', failureRedirect: 'tweets'})(req, res, function() {
                res.redirect("tweets")
               // res.redirect("Home")
            })
        }
    });
});



app.get('/register',(req,res)=>{
    res.render('register')
});
app.post('/register', (req, res) => {
    User.register({username: req.body.username,name:req.body.name}, req.body.password, function(err, user) {
        if(err) {
            console.log(err)
            res.redirect("/register");
        } else {
            passport.authenticate("local")(req, res, function() {
               
                res.redirect("tweets")
            })
        }
    });
});


app.get('/tweets', (req, res) => {
     const id = req.user._id;

    if (req.isAuthenticated()) {
        User.findById(id).exec()
        .then((user) => {
            if(user) {
                res.render('tweets', {user: user,tweets:user.tweets});
            }
        });
        
    } else {
        res.redirect("login");
    }
});
app.post('/tweets',async function (req, res){
    const tweets =req.body.tweets;
    console.log(tweets)
    const id = req.user._id;
    const name = req.user.name;
    const timestamp = new Date();
    const tweetitems = await User.findById(id).lean();
    tweetitems.tweets.push({ tweet:tweets,name:name,timestamps:timestamp})
    User.findByIdAndUpdate(id, tweetitems).exec().then(function (doc){
        res.redirect('/tweets' )
       });
    
  
})
app.get('/logout', (req, res) => {
    req.logout(function(err) {
        if(err) {
            console.log(err)
        }
    });
    res.redirect("/");
});

app.get('/Home',(req,res)=>{
    res.render("Home")
})


app.listen(port,()=>{
    console.log("My first express project is live");
})



