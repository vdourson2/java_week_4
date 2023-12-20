# Naming Collisions

* Type of challenge: **Learning**
* Duration: **Unknown**
* Team challenge: **Solo**

## Learning objectives
- Understand the concept of polymorphism and its application in Spring.
- Learn to create beans from interfaces in the Spring context.
- Practice creating a simple command-line tool using Maven and Spring.

## Requirements
- Java development environment set up with Maven.
- Basic understanding of Spring framework concepts.

## The Mission

Your mission is to create a small command-line tool using Maven and the Spring framework. The tool should support two commands: `hello` and `time`. To achieve this, follow these steps:

1. Set up a Maven project:
   - Create a new Maven project in your preferred Java development environment.
   - Add the necessary dependencies for using the Spring framework.

2. Define the Command interface:
   - Create an interface named `Command` with a single method `execute()`.
   - This interface will act as the blueprint for our command classes.

3. Implement the `hello` command:
   - Create a class that implements the `Command` interface.
   - In the `execute()` method, print the message "Hello world" to the console.

4. Implement the `time` command:
   - Create another class that implements the `Command` interface.
   - In the `execute()` method, print the current time in the format "Current time is: <the current time>" to the console.

5. Create Spring beans for the commands:
   - Configure the Spring context to create beans from the `Command` interface.
   - Ensure that both the `hello` and `time` command classes are registered as beans.

6. Build the command-line tool:
   - In your main Java class, use the Spring context to retrieve the beans for both the `hello` and `time` commands.
   - Use a loop to repeatedly prompt the user for a command input.
   - When the user enters `hello`, execute the `hello` command.
   - When the user enters `time`, execute the `time` command and display the current time.

Ensure that your command-line tool can handle multiple command inputs in sequence and execute the corresponding commands correctly.

Remember to maintain a clean and organized project structure, and write test cases to validate the functionality of each command.