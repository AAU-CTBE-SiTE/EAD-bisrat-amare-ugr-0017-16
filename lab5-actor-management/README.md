# Lab 5: Actor Management REST API

## Description

This project implements an Actor Management REST API using Spring Boot. It demonstrates RESTful web services and CRUD operations.

## Technologies Used

- Java 17
- Spring Boot 3.5.0
- Maven
- Spring Web

## Project Structure

```text
src/main/java/com/craft/actormanagement/
├── ActorManagementApplication.java
├── controller/
│   └── ActorController.java
└── model/
    └── Actor.java

src/main/resources/
└── application.properties
```

## API Endpoints

Base URL: `http://localhost:8080/api/actors`

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/actors` | Retrieve all actors |
| GET | `/api/actors/{id}` | Retrieve an actor by ID |
| POST | `/api/actors` | Add a new actor |
| PUT | `/api/actors/{id}` | Replace an actor |
| PATCH | `/api/actors/{id}` | Partially update an actor |
| DELETE | `/api/actors/{id}` | Delete an actor |

## Example JSON

```json
{
  "name": "Christian Bale",
  "movie": "The Dark Knight"
}
```

## Running the Application

Run the following command from the project directory:

```bash
mvn spring-boot:run
```

The application runs on port 8080.

## Note

This project uses an in-memory ArrayList to store actor information. Data is reset when the application restarts.