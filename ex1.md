# Exercise 1

### 1. Start the json server with `personsdb.json` file

1. Open the personsdb.json and look inside. This is an array of person objects
2. Read the jsonserver.md file to see how to install and run the jsonserver with the mockdata from personsdb.json.
3. Skim this [Resource](https://www.codementor.io/ayushgupta/how-to-use-json-server-to-create-mock-apis-0-lci958ear) to see what you can do with the json server
4. Test the server with Postman making get and post requests

### 2. Create a web application in your preferred ide

1. Create a html page and a js file and link them.
2. In the html page make a div with id = app.
3. In the js file create a fetch call that can console.log all the person objects from the jsonserver
4. make a function that can transform the array of person objects and create a text string with html table element with all the persons in each a different row and all data of each object in <td> tags. Insert the table in the app element. [See a solution if you are stuck](https://gist.github.com/Thomas-Hartmann/54b66dea451a36f9aaf5b517b3245599)

### 3. Add an input form to the page

1. Add a form to the html page to collect all the information needed to add a new person to the server.
2. Add a submit button and in the js file make an event handler that can use af fetch call to post data to the server.
3. Test that you can add data via the form.

### 4. Sorting ( advanced exercise )

1. Create (if not allready done) headers to each column in the table
2. Make each column name clickable and attach an event handler
3. Make the event handler sort the data based on the column that was clicked. 