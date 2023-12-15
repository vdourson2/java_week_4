# Becode Java track
Week 4 : Get started with Spring

## Briefing
[Instructions](https://github.com/becodeorg/Java/tree/master/week_4) for the exercise.

### Challenges

1. [Hello World with Spring](Challenges/01.Hello_World_with_Spring.md)
2. [Word Counter](./Challenges/02.Word_Counter.md)
3. [Naming Collisions](./Challenges/03.Naming_Collisions.md)
4. [Hospital Registration Portal](./Challenges/04.Hospital_Registration_Portal.md)

---> [Resources](./RESOURCES.md) <---

### Get Started with Spring

As we reach Week 4 of Java, you should have gained fluency in standard Java syntax, and testing concepts have been introduced. In this week, we are taking testing to the next level by introducing mocking, which is closely tied to the Spring framework and dependency injection. However, we must remain mindful of Object-Oriented concepts, especially encapsulation, as it can become challenging when working with Spring.

It's crucial to be aware of the potential issues with class reusage, particularly when dealing with different contexts in Spring. Many Spring examples promote the use of 'services' to encapsulate domain-related behavior. These services tend to encompass numerous stateless public methods, which, over time, can lead to the emergence of massive and tightly coupled classes that become difficult to test.

Therefore, we should educate about the dangers of this approach. It's important to recognize that even though many developers adopt this pattern, it can result in code that is hard to maintain and test. Encourage exploring alternative approaches that promote better separation of concerns and improved testability, despite the possibility of encountering conflicting practices in the development community.

In this learning journey, we will explore the fascinating world of Spring. You will learn what Spring is, its origin, and how it has evolved over time. Our focus will be on understanding essential concepts such as Inversion of Control (IoC) and Dependency Injection and the problems they solve.

We'll start with basic Spring concepts, excluding Spring Boot for now. You'll become familiar with elements like beans and the process of wiring or injecting dependencies. Think of Spring as a master of the Factory design pattern, building objects (beans) and injecting them into other beans. We'll also cover how to address naming collisions effectively.

Spring, by default, follows the singleton pattern, meaning beans are created once and shared throughout the application. You'll grasp the concept of bean scopes, which determines the beans' lifecycle within the application.

Working with property files is an essential aspect of Spring development, and we'll teach you how to seamlessly integrate property files with Spring and Maven.

Additionally, you'll get acquainted with annotations like @Configuration, @Service, @Component, and more! We'll introduce you to the powerful component scanning feature in Spring, making the configuration process simpler.

### Goals for Week 4

- Understand what Spring is, where it came from, and why it was built.
- Be able to explain what IoC and Dependency Injection are and their benefits.
- Start a simple Spring project using Maven.
- Understand Maven and its role in project management. Know the structure of a Maven `pom.xml` file.
- Know important Maven commands: mvn clean install, mvn clean compile, mvn dependency:tree, mvn dependency:resolve.
- Gain a basic understanding of Spring's functioning, including bean factory and bean container.
- Comprehend Spring beans, scopes, and their lifecycle, particularly singleton and prototype scopes.
- Understand how Spring performs bean injection/wiring using naming conventions and package scanning.
- Learn about mocking frameworks and their usage to test Spring beans effectively.


> **NOTE**: For practice, you are encouraged to choose any of the previous challenges and attempt to implement a Spring version of it. This will allow you to apply Spring concepts in real-world scenarios and reinforce your understanding of the framework. Enjoy the learning process and feel free to experiment with different aspects of Spring!
