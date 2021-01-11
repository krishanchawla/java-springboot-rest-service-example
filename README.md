## Java Springboot Restful Service Example

The sole purpose of this application is to demonstrate the development of Restful API's in Java Spring Boot. The application contains multiple Rest API endpoints for GET, POST, PUT, DELETE for demonstration purpose. The API Documentation can also be refered through the Swagger UI within the application.

There is no Database implementation in the project. The project consists of simple Restful API's that hold the set of data in static variable.

## How to Setup
1. Clone the Github Project
https://github.com/krishanchawla/java-springboot-rest-service-example

2. Setup the Project in IntelliJ / Eclipse.

3. Configure the application Port if Required in
    `src/main/resources/application.properties -> server.port`

4. Build and run the app using maven
    `mvn package`
    `java -jar target/spring-boot-rest-api-tutorial-0.0.1-SNAPSHOT.jar`
    
    Alternatively, you can run the app without packaging by executing UserServiceApplication.java from IntelliJ or Eclipse.

5. The app will start at http://localhost:8080 by default.

## Documentation
The documentation for the API's can be accessed through the Swagger UI within the application using the following URL:

**Swagger UI Path -** <Application-IP>:<ApplicationPort>/swagger-ui.html/
  
![Swagger-UI](https://user-images.githubusercontent.com/28475979/104162626-fe769800-541a-11eb-8489-f96fbb4316de.JPG)


## Available Rest API's
The following API's are available in the application.

* **GET** - /user-service/api/ :: `Get the details of all users in application`

* **GET** - /user-service/api/{userid} :: `Get the details of user for provided userid`

* **PUT** - /user-service/api/add :: `Add a new user is application`
    > **Request:**
      
        {
            "userid": "KRISHAN001",
            "firstname": "Krishan",
            "lastname": "Chawla",
            "emailid": "krishanchawla1467@gmail.com",
            "role": "ADMIN",
            "status": 1
        }

* **DELETE** - /user-service/api/delete/{userid} :: `Delete an existing user is application`

* **POST** - /user-service/api/update :: `Modify an existing user is application`
    > **Request:**
          
            {
                "userid": "KRISHAN001",
                "firstname": "Krishan",
                "lastname": "Chawla",
                "emailid": "krishanchawla1467@gmail.com",
                "role": "ADMIN",
                "status": 1
            }
