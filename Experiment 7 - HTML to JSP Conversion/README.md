# Experiment 7 - HTML to JSP Conversion

## Aim
To understand JavaServer Pages (JSP) and convert an HTML page into a JSP page while studying JSP architecture, lifecycle, directives, Expression Language (EL), and Servlet-JSP interaction.

## Technologies Used
- Java
- JSP (JavaServer Pages)
- Jakarta Servlet API 6.1.0
- Apache Maven
- Apache Tomcat 11
- HTML

## Project Structure
```text
Experiment 7 - HTML to JSP Conversion/
├── pom.xml
└── src/
    └── main/
        ├── java/
        │   └── com/
        │       └── servlet/
        │           └── HelloServlet.java
        └── webapp/
            ├── student.jsp
            └── result.jsp
```

## Description
This experiment converts an HTML student registration form into a JSP page. The form collects the student's name, email, course, and age. `HelloServlet` processes the submitted data and forwards the request to `result.jsp`, which displays the student details using JSP Expression Language (EL).

## Concepts Demonstrated
- JSP architecture and lifecycle
- JSP page directive
- HTTP POST request handling
- `request.getParameter()`
- `request.setAttribute()`
- `RequestDispatcher.forward()`
- Expression Language (EL)
- Servlet as controller and JSP as view

## How to Run
1. Build the project using `mvn clean package`.
2. Copy the generated WAR file from the `target` folder into Tomcat's `webapps` directory.
3. Start Apache Tomcat 11.
4. Open the student registration page in a browser.

## Application URL
`http://localhost:8080/html-to-jsp/student.jsp`

## Expected Output
The application displays a student registration form. After submission, it displays a registration success message and the entered student details.

## Conclusion
The experiment demonstrates how a Servlet processes form data and forwards it to a JSP page for presentation using Expression Language.
