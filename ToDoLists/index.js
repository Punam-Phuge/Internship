var express = require('express');
var bodyParser =  require('body-parser');
var mongoose = require('mongoose');
var Schema = require('mongoose');
const { ObjectId } = require('mongodb');

const app = express();
const port = 4000;

app.use(bodyParser.urlencoded({ extended: true }));
app.use(express.static("public"));

mongoose.connect('mongodb://127.0.0.1:27017/todoListsDB');


const listSchema = new mongoose.Schema({
    name: String,
    items:[{name:String}]
});


const List = mongoose.model("List", listSchema);


app.get("/",function(req,res){

//List.insertMany([item3, item4]);

    List.find({}).then(function(f){
   
    res.render("Home.ejs", { listTitles: f}
      );
    })
});

app.get("/AddList",function(req,res){
 res.render("AddList.ejs");
        });


app.post("/AddList", function (req, res) {
  const list = req.body.newList;
  const item1 = "Welcome to ToDo List";
  const item2 = "How are you doing?";
 
  
  const newList = new List({
    name: list,
    items:[{name:item1},{name:item2}]
    
  });
  newList.save();

  res.redirect('/')
});


app.get("/element/:id", function (req, res) {
  const id = req.params.id;

  List.findById(id).exec().then(function (docs) {
    
    res.render("element.ejs",{Listname:docs.name,Listitems:docs.items,ListID:docs._id});
  })
  .catch(function (err) {
    console.log(err);
  });

});

  // Find list by ID

  // Render the list
  app.post('/element/:id', async function (req, res) {
    const list = req.body.newList;
    const id = req.params.id;

    const listElement = await List.findById(id).lean();

    listElement.items.push({ name:list})

     List.findByIdAndUpdate(id, listElement).exec().then(function (doc){
      res.redirect('/element/'+ doc._id )
     });
  
  });


app.post('/delete', async function (req, res) {
  const id = req.body.item
 
 let docs = await List.find({"items._id":id }).lean().exec();

    let indexNo;
    let counter=0;

    docs[0].items.forEach(element => {
      if(element._id == id){
        indexNo=counter;
      }
      counter++;
    });
    
    docs[0].items.splice(indexNo,1);

    List.findByIdAndUpdate(docs[0]._id, docs[0]).exec().then(function (doc){
      res.redirect('/element/'+ doc._id )
     });

    
  });

app.listen(port, () => {
  console.log(`Server running on port ${port}`);
});

