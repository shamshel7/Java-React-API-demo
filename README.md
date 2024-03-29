# Java-React API demo

## Running the code
The code is run using Maven, which can be downloaded here: http://maven.apache.org/download.cgi

Instructions on installation are here: http://maven.apache.org/install.html



Navigate to the main folder (react-java-api-demo), and run the following commands:

`mvn clean install`

`java -jar target/messages-0.0.1-SNAPSHOT.jar`

The backend should now be running on `localhost:8080`. You can go to `localhost:8080/api/messages` and `localhost:8080/api/formdata` to see objects used. You can also go to `localhost:8080/h2-console` to inspect the database. The login info can be found in `react-java-api-demo\src\main\resources\application.properties`.

To run the frontend, open a separate terminal, navigate to `react-java-api-demo\src\main\ui` and run the following command:

`npm start`

This should open the page in your default browser. If it doesn't, navigate manually to `localhost:3000`.


## To add new parameters
To add new parameters:
1. Add the new parameter into the database (either at `localhost:8080/h2-console` or manually in `react-java-api-demo\src\main\resources\data.sql`.
2. Add the new parameter to the model at `react-java-api-demo\src\main\java\com\messages\entity\Messages.java`
3. Re-run the code.

## Potential improvements
* Bundle the react code with Maven so you don't need to run mvn AND npm on separate ports.
* Improve styling.
* Add unit tests.
* Improve the form validation, to make sure the email format is correct.
* Clean up the URL after submitting a new entry.
* Keep the input boxes filled in after validation fails.
