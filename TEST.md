[⬅️ Back to README](README.md)

# 🧪 Running Tests
This document explains how to run the unit tests included in this repository.

## Requirements
- IntelliJ IDEA (latest version recommended)
- Java 17 or higher
- JUnit 5

## Running Tests in IntelliJ
1. Open the project in IntelliJ IDEA.
2. Navigate to the implementation/test/implementation folder in the Project Explorer.
3. Right-click the folder (or a specific test class) and select Run 'All Tests'.
4. The Run window will display the results of all executed tests.
5. Green = passed, Red = failed.

## Running Tests from Command Line (Optional)
If your project uses Gradle or Maven:

### Gradle
```bash
./gradlew test
```

### Maven
```bash
mvn test
```

## Notes
- All tests are written using JUnit 5.
- Tests cover all major classes and functionalities for the assignments.
