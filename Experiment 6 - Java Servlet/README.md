# Experiment 6 - Java Servlet

## Aim
To study server-side programming using Java Servlets and implement a basic web application.

## Technologies Used
- Java
- Jakarta Servlet API 6.1.0
- Apache Maven
- Apache Tomcat 11
- HTML

## Project Structure
```text
Experiment 6 - Java Servlet/
├── pom.xml
└── src/
    └── main/
        ├── java/
        │   └── com/
        │       └── servlet/
        │           └── HelloServlet.java
        └── webapp/
            └── index.html
```

## Description
This experiment demonstrates how Java Servlets process HTTP requests and generate HTTP responses. The application contains a homepage and a `HelloServlet` that displays a welcome message.

## How to Run
1. Build the project using `mvn clean package`.
2. Copy the generated WAR file from the `target` folder to the Tomcat `webapps` folder.
3. Start Apache Tomcat.
4. Open the application in a browser.

## URLs
- Homepage: `http://localhost:8080/servlet/`
- Hello Servlet: `http://localhost:8080/servlet/hello`

## Output
The homepage displays the Java Servlet Experiment 6 heading. The servlet displays:
- Hello Students!
- Welcome to Servlet Programming
