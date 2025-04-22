
# CS-5351-Dynamic-Thread-Pool

A project for CS-5351, focusing on the implementation of a dynamic thread pool. This repository contains core modules, an admin interface, Spring Boot integration, testing modules, logs, and documentation—suitable for learning, demonstration, and extensions.

## Directory Structure

```
├── data/log/                               # Logs and related data
├── docs/                                   # Project documentation
├── dynamic-thread-pool-admin/              # Thread pool admin module
├── dynamic-thread-pool-spring-boot-starter/# Spring Boot starter example
├── dynamic-thread-pool-test/               # Unit and integration tests
├── .gitignore                              # Git ignore configuration
├── README.md                               # Project description
├── pom.xml                                 # Maven build file
```

## Getting Started

1. **Clone the Repository**  
   ```bash
   git clone https://github.com/<your-repo-path>/CS-5351-Dynamic-Thread-Pool.git
   ```

2. **Build the Project**  
   In the root directory, run:
   ```bash
   mvn clean install
   ```

3. **Run the Spring Boot Example**  
   Enter the `dynamic-thread-pool-spring-boot-starter` directory:
   ```bash
   mvn spring-boot:run
   ```

4. **Run Tests**
   ```bash
   mvn test
   ```

## Features

- Dynamic thread pool parameter tuning
- Spring Boot integration
- Logging and basic monitoring support
- Example admin and test modules

## Documentation

For detailed usage and development guides, please refer to the `docs/` folder and the instruction file.


---

For questions or feedback, please open an issue or contact the maintainer.

