# Hospital Registration Portal

* Type of challenge: **Project**
* Duration: **Unknown**
* Team challenge: **Solo**

## Learning objectives
- Understand how to create a command-line driven program using Maven and the Spring framework.
- Learn to use Spring beans to maintain state and act as an interim database.
- Practice working with command-line input and data manipulation.

## Requirements
- Java development environment set up with Maven.
- Basic understanding of Spring framework concepts.

## The Mission

Your mission is to create a command-line driven program using Maven and the Spring framework that serves as a hospital registration portal. Follow these steps to complete the challenge:

1. Set up a Maven project:
   - Create a new Maven project in your preferred Java development environment.
   - Add the necessary dependencies for using the Spring framework.

2. Implement the `register` command:
   - Create a Spring component (bean) responsible for handling the registration process.
   - When the program starts, prompt the user to enter their name and last name.
   - Offer a choice between two (made up) doctors, or an option to visit a patient without selecting a doctor.
   - Store the user's information, doctor choice (if any), and the timestamp of the visit.

3. Implement the `report` command:
   - Create another Spring component (bean) responsible for generating and displaying the visit report.
   - When the user enters the `report` command, display a report with the following information:
     - List of visitors with their names and last names.
     - For each visitor, indicate whether they visited a doctor or a patient, and the timestamp of the visit.

4. Handle Spring bean state:
   - Use Spring beans to maintain state and serve as an interim database to store visitor information.
   - Configure the beans to retain their state between command-line inputs.

5. Build the command-line tool:
   - In your main Java class, use the Spring context to retrieve the beans for the `register` and `report` commands.
   - Use a loop to repeatedly prompt the user for a command input.
   - Based on the user's choice, execute either the `register` or `report` command.

Ensure that your program accurately captures visitor information and generates the report correctly. Test your application thoroughly to verify its correctness and robustness.

Remember to maintain a clean and organized project structure, and write test cases to validate the functionality of each command.