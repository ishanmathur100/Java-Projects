# ResolveX — Smart IT Service Desk & Issue Management Platform

ResolveX is a web-based IT service desk application built with Java and Spring Boot. It helps support teams create, track, prioritize, search, and manage technical support tickets through a centralized dashboard.

## Features

- **Dashboard:** View total, open, resolved, and high-priority ticket statistics.
- **Ticket Creation:** Submit support requests with a title, description, and priority.
- **Ticket Management:** Update ticket status and assign tickets to support staff.
- **Search:** Find tickets using issue details and other displayed information.
- **Filtering:** Filter tickets by status and priority.
- **Input Validation:** Reject missing titles, missing descriptions, and invalid priority values.
- **Database Persistence:** Store tickets in MySQL.

## Technologies Used

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- MySQL
- Thymeleaf
- HTML and CSS
- JavaScript
- Maven

## Prerequisites

Before running ResolveX, install:

- Java Development Kit (JDK)
- MySQL Server
- Git (optional, for version control)

## Setup and Installation

### 1. Clone the repository

```bash
git clone YOUR_REPOSITORY_URL
cd ResolveX
```

Replace `YOUR_REPOSITORY_URL` with the actual URL of your ResolveX repository.

### 2. Create the database

Open MySQL and execute:

```sql
CREATE DATABASE resolvex_db;
```

### 3. Configure database credentials

Open `src/main/resources/application.properties` and configure your local MySQL username and password.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/resolvex_db
spring.datasource.username=YOUR_MYSQL_USERNAME
spring.datasource.password=YOUR_MYSQL_PASSWORD

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

server.port=8080
```

**Security:** Never commit real database passwords or other secrets to a public repository.

### 4. Run the application

From the project root, execute:

**Windows PowerShell:**

```powershell
.\mvnw.cmd spring-boot:run
```

### 5. Open ResolveX

Visit the following URLs in your browser:

- Dashboard: `http://localhost:8080`
- Ticket list: `http://localhost:8080/tickets`
- Create ticket: `http://localhost:8080/tickets/new`

## Project Structure

```text
ResolveX/
├── src/
│   └── main/
│       ├── java/com/resolvex/
│       │   ├── ResolvexApplication.java
│       │   ├── HomeController.java
│       │   ├── TicketController.java
│       │   ├── Ticket.java
│       │   └── TicketRepository.java
│       └── resources/
│           ├── templates/
│           │   ├── index.html
│           │   ├── tickets.html
│           │   └── create-ticket.html
│           └── application.properties
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## Future Enhancements

- User authentication and role-based access control
- Dedicated support-agent and administrator dashboards
- Ticket comments and activity history
- Email notifications
- Pagination for large ticket collections
- Advanced reporting and analytics
- Automated testing

## Author

**Ishan Mathur**

Developed as a Java and Spring Boot web application project to demonstrate database integration, MVC architecture, ticket management, and web development skills.

