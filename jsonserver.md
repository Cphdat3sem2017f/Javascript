# Json server

[Tutorial here](https://www.codementor.io/ayushgupta/how-to-use-json-server-to-create-mock-apis-0-lci958ear)

### Prerequisites

- node and npm
- postman for testing 

### Getting started

open git bash from a working folder and run:

```assembly
npm install -g json-server
```

create dummy data by making a javascript program and run it with node.   

Create a file in the working folder: mockdata.js:

```javascript
var casual = require('casual');

// Create an object for config file
var db = {books:[]};

for(var i=101; i<=115; i++){
    var book = {};
  book.id = i;

  // Create a random 1-6 word title
  book.title = casual.words(casual.integer(1,6));
  book.author = casual.first_name + ' ' + casual.last_name;
  
  // Randomly rate the book between 0 and 5
  book.rating = Math.floor(Math.random()*100+1)/20;

  // Assign a publishing year between 1700 and 2016
    book.year_published = casual.integer(1700,2016)
    db.books.push(book);
}
console.log(JSON.stringify(db));
```

This script is using `casual` to generate random data. Install it into the same folder.

```
npm install casual
```

In git bash run the js script like this

```assembly
bash -c "node mockdata.js > booksdb.json"
```

It will write an array of 15 book objects into a file: booksjb.json

Open the file to see the data format (or in the bash just `node mockdata.js` without the pipe `>` character)

Now run the jsonserver with your new db:

```assembly
json-server -p 4000 --watch booksdb.json
```

open postman (or for get request use the browser) and open url: `http://localhost:4000/books`
