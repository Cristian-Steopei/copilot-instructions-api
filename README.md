# Copilot Instructions API

A simple Spring Boot web API that provides CRUD functionality for a `Transfer` entity.

## Project overview
- Language: Java (Spring Boot)
- Build: Gradle
- Database: PostgreSQL
- Lombok used for reducing boilerplate

## Quick start
1. Create a `.env` file at the project root (or set environment variables) with the following values:
   - DB_URL (jdbc URL to your PostgreSQL instance)
   - DB_USER
   - DB_PASSWORD

2. Build and run the application:
   - Build: `./gradlew build`
   - Run: `./gradlew bootRun`

3. Run tests:
   - `./gradlew test`

## API
- POST /api/transfers
  - Creates a Transfer record.
  - Request body (application/json):
    {
      "name": "Player A",
      "from": "Team X",
      "to": "Team Y",
      "amount": "$10m"
    }
  - Responses:
    - 201 Created: returns created Transfer JSON
    - 400 Bad Request: validation error
    - 500 Internal Server Error: unexpected error

## Coding standards
This project follows the conventions documented in `.github/copilot-instructions.md`. Key points:
- Use camelCase for variable and method names.
- Use meaningful names and follow SOLID principles.
- Unit tests required for new code where practical.

## Tests
Unit tests are located under `src/test/java`. Run them with `./gradlew test`.

## Notes
- Secrets should be supplied via environment variables or a `.env` file; no sensitive data is checked into source control.
- Consider adding integration tests and improving error response bodies for production use.

## License
No license specified.

