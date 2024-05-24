
# Spring Demo

Spring Demo is a simple Spring Boot project designed to showcase basic skills in creating RESTful APIs using Spring Boot.

## Features

- RESTful API implementation
- Basic CRUD operations
- Simple demonstration of Spring Boot capabilities

## Skills Demonstrated

- Setting up a Spring Boot project
- Creating RESTful APIs with Spring Boot
- Handling HTTP requests and responses
- Using Spring Boot annotations for controllers and services
- Dependency injection
- Maven project management

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/Zaone999/spring-demo.git
   cd spring-demo
   ```

2. Build the project using Maven:
   ```bash
   ./mvnw clean install
   ```

3. Run the Spring Boot application:
   ```bash
   ./mvnw spring-boot:run
   ```

## Usage

The application exposes a simple RESTful API. You can test the endpoints using a tool like Postman or `curl`.

Example endpoint:
- `GET /flights/api/` - Retrieves a list of demo items

## Project Structure

- `src/main/java/com/example/springdemo/` - Contains the main application files
  - `controller/` - Contains the REST controllers
  - `service/` - Contains the service layer
  - `model/` - Contains the data models
- `src/main/resources/` - Contains the application configuration files
- `pom.xml` - Maven configuration file

## Contributing

Contributions are welcome! Please submit a pull request or open an issue to discuss any changes.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Acknowledgements

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Maven](https://maven.apache.org/)
