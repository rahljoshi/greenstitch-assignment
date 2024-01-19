# auth-assignment

This repository contains the authentication assignment.

### About Project
* I created a Spring Boot project using JWT Tokens for authentication and authorization.    
* I have used IntelliJ as my IDE for this assignment.
* I have used Spring Boot and H2 as database alongside JWT.

### How to run the project
Clone this repository can then you can open this project in any ide like IntelliJ/Eclipse and once you open it, IDE will automatically download all the required
dependencies, and after it you can run the main file **_AuthenticationApplication_** 

## Project Structure
* _config_ package contains security-related configurations, like Authentication Manager, configuring endpoints that should be authorized and which should not.
* _controller_ package contains two controllers home controller and the user controller.
* _filter_ package contains JwtFilter class which is used to filter the token from the incoming request and then send it ahead for validating it.
* _model_ package contains models which are required for the project which are User and JWTResponse classes.
* _repository_ package contains repository classes for the models.
* _service_ package contains the User service class which is the service layer that performs actions on the User model.
* _utility_ package contains JWTUtility class which basically helps to generate tokens, validate them, expire the token, etc.

### Flow of the project
* After starting the project you have first to register the user. 
  * URL: http://localhost:8090/add and Request body will be in JSON format and it will have two fields username and password.
* After registering the user you have to log in and once you log in you will receive the JWT Token as a response.
  * URL: http://localhost:8090/login and request body will be in JSON format and it will have two fields username and password.
* Once you have the token then you add the token to your request and send the request, once you send the request you will receive a string as a response.
  * URL: http://localhost:8090/home

## Screenshots

* register user request ![Screenshot (102)](https://github.com/rahljoshi/greenstitch-assignment/assets/59885237/baf21283-08a2-4f83-8fdb-76ed96a9e5b2)
* login user request ![Screenshot (103)](https://github.com/rahljoshi/greenstitch-assignment/assets/59885237/b151675f-46f4-49e8-93a1-a5884f91b153)
* authorized request ![Screenshot (104)](https://github.com/rahljoshi/greenstitch-assignment/assets/59885237/8ab744e1-511d-40ce-8378-bb3445ec6430)
* unauthorized request ![Screenshot (105)](https://github.com/rahljoshi/greenstitch-assignment/assets/59885237/52859986-718c-466f-9ded-4eac53093d8c)

