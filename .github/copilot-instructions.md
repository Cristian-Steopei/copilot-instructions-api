# Project Overview

This project is a simple web API with CRUD functionality for an entity "Transfer".
It is only backend, no frontend is provided.

## Folder Structure

- `/src/main/java/com.instructions.copilot.copilotInstructionsAPI`: Contains the main application code.
  - `/model`: Contains the entity class
  - `/repository`: Contains the repository interface for data access.
  - `/controller`: Contains the REST controller for handling API requests.
  - `/service`: Contains the service layer for business logic.
- `/src/main/resources`: Contains configuration files and resources.
- `/test`: Contains unit tests.

## Libraries and Frameworks

- Spring Boot for the backend.
- PostgresSQL for data storage.
- Gradle for build automation
- Update build.gradle file with every new dependency.
- Lombok to reduce boilerplate code.
- JUnit for testing.

## Coding Standards

- Use semicolons at the end of each statement.
- Use single quotes for strings.
- Use best practices for Java.
- Use camelCase for variable and method names.
- Use meaningful variable and method names.
- Follow SOLID principles.
- Maximize use of interfaces and abstractions.
- Ensure code is clean and well-organized.
- Ensure proper error handling.
- No sensible data in the code - only in the .env file.
- Write meaningful commit messages.
- Follow RESTful API design principles.
- Use arrow functions for callbacks.
- Every written code must be unit-tested if possible.
- Every written code must be documented (with comments if necessary).
- The README file must be updated with every new feature (create it if it does not exist).