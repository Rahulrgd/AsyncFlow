# Reactive Web Application: Asynchronous Data Retrieval

This reactive web application demonstrates the power of asynchronous programming using Spring WebFlux and R2DBC. By leveraging reactive principles, we achieve non-blocking data retrieval, allowing threads to continue processing other tasks while waiting for responses.

## Dependencies

- **Spring WebFlux**: Enables reactive programming in Spring applications.
- **R2DBC**: Reactive Relational Database Connectivity for MySQL.
- **Lombok**: Simplifies Java code by reducing boilerplate.
- **MySQL Driver**: Connects to the MySQL database.
- **Spring Boot DevTools**: Enhances development experience.
- **Flyway**: Handles database migrations.

## Features

1. **Student Service:**
   - Provides APIs for managing student data.
   - Demonstrates asynchronous data retrieval.
   - Example method:
     ```java
     public Flux<Student> findAll() {
         return studentRepository.findAll().delayElements(Duration.ofSeconds(1));
     }
     ```

2. **Database Configuration:**
   - Configure R2DBC to connect to your MySQL database.
   - Use Flyway for seamless database schema updates.

## Usage

1. Clone this repository.
2. Set up your MySQL database and configure the connection in `application.properties`.
3. Build and run the application.
4. Access the APIs and observe the asynchronous behavior.