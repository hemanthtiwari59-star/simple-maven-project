# Simple Maven Calculator

A beginner-friendly Java Maven project that demonstrates the standard Maven folder structure, dependency management, compilation, testing, and packaging.

## Requirements

- JDK 17 or later
- Apache Maven 3.6.3 or later

Check your installations:

```bash
java -version
mvn -version
```

## Run the application

From the project root (the folder containing `pom.xml`):

```bash
mvn compile exec:java
```

## Run the tests

```bash
mvn test
```

## Build the project

```bash
mvn clean package
```

The compiled classes and packaged JAR are placed in the `target/` directory.
