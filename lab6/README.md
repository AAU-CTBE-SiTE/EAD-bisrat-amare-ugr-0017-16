
# Lab 6: Aspect-Oriented Programming (AOP)

**Course:** Enterprise Application Development

**Student:** Bisrat Amare

**ID:** UGR 0017/16

## Objective

This lab demonstrates Aspect-Oriented Programming (AOP)
using the Spring Framework.

## Implemented Concepts

The project demonstrates five types of AOP advice:

1. Before Advice (@Before)
2. After Advice (@After)
3. After Returning Advice (@AfterReturning)
4. After Throwing Advice (@AfterThrowing)
5. Around Advice (@Around)

## Technologies Used

- Java 17
- Spring Boot 3.5.0
- Spring Web
- Spring AOP
- Maven

## Project Components

- Lab6Application: Main Spring Boot application.
- StudentService: Contains student business operations.
- LoggingAspect: Implements the five AOP advice types.
- StudentController: Provides REST API endpoints.

## REST API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /api/students/{name} | Add student |
| GET | /api/students/{name} | Get student |
| DELETE | /api/students/{name} | Delete student |
| GET | /api/students/error/test | Test exception advice |

## Running the Application

Run the following commands:

```bash
mvn clean test
mvn spring-boot:run
```

The application runs on port 8080.

## Conclusion

This lab demonstrates how Spring AOP separates
cross-cutting concerns from the main business logic
using different types of advice.
