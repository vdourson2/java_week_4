# Hello World with Spring

* Type of challenge: **Discovering**
* Duration: **unknown**
* Team challenge: **solo**  

## Learning objectives
- Gain familiarity with Maven and the plain Spring library.
- Understand how to use configuration properties in a Spring application.
- Practice writing test cases for classes.

## Requirements
- Java development environment set up with Maven.
- Basic understanding of Spring framework concepts.

## The Mission

Your mission is to create a small Java program using Maven and the plain Spring library (not Spring Boot) that prints a customized hello message in the terminal. The language of the hello message will be determined by a configuration property. To accomplish this, you need to follow these steps:

1. Set up a Maven project:
- Create a new Maven project in your preferred Java development environment.
- Add the necessary dependencies for using the plain Spring library.

2. Create a configuration property file:
- Create a properties file (e.g., `application.properties`) in your project's resources folder.
- Add a property named `configured_language` with a value representing the desired language code (e.g., NL, FR, GER).
- Add properties for the hello messages in different languages, including your native language.

   Example of the property file:

```properties
configured_language=NL
native_hello_world=hello world in spring!
NL_hello_world=Hallo wereld met spring!
FR_hello_world=Bonjour le monde avec spring!
GER_hello_world=Hallo Welt mit Schpring!
```

3. Create the Hello World service:
- Create a Spring service class that reads the configuration property to determine the language of the hello message.
- Based on the language code, retrieve the appropriate hello message from the property file.
- Store the hello message in a variable.

4. Implement the main method:
- Create a Java class with the `main` method to execute your application.
- Use the Spring context to instantiate the Hello World service.
- Call the service to get the hello message based on the configured language.
- Print the hello message in the terminal.

5. Write unit tests:
- Write test cases for the Hello World service class.
- Ensure the service correctly reads the configuration property and returns the corresponding hello message for each language.
- You don't need to test the class containing the `main` method.

Remember to adhere to good coding practices and ensure your project structure is clean and organized. Once you have completed the mission, make sure to test your application thoroughly to verify its correctness.