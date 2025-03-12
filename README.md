# HPlus App

## Description
HPlus App is a demo project for Spring Boot.

## Project Structure
```
.gitattributes
.gitignore
HELP.md
mvnw
mvnw.cmd
pom.xml
README.md
.mvn/
    wrapper/
        maven-wrapper.properties
.vscode/
    settings.json
src/
    main/
        java/
        resources/
        webapp/
    test/
        java/
target/
    hplusapp-0.0.1-SNAPSHOT.war
    hplusapp-0.0.1-SNAPSHOT.war.original
    classes/
        application.properties
        client-theme1.properties
        client-theme2.properties
        ...
    generated-sources/
    generated-test-sources/
    hplusapp-0.0.1-SNAPSHOT/
    maven-archiver/
    maven-status/
    surefire-reports/
    test-classes/
```

## Prerequisites
- Java 23
- Maven
- MySQL

## Installation
1. Clone the repository:
    ```sh
    git clone <repository-url>
    ```
2. Navigate to the project directory:
    ```sh
    cd hplusapp
    ```
3. Install dependencies:
    ```sh
    mvn install
    ```

## Running the Application
To run the application, use the following command:
```sh
mvn spring-boot:run
```

## Building the Application
To build the application, use the following command:
```sh
mvn package
```

## Dependencies
- Spring Boot Starter Data JPA
- Spring Boot Starter Web
- MySQL Connector
- Spring Boot Starter Tomcat

## License
This project is licensed under the MIT License.

## Authors
- Kevin Chen

