
# Java Projects

## Overview
This repository contains Java projects developed for learning and practical work. Each project demonstrates Java programming concepts and application development.

## Projects

### 1. Student Registration System
**Project Name:** Student Registration System

**Description:** A Java Swing application for student registration.

**Technologies Used:**
- Java
- Java Swing
- VS Code

**Main File:** `StudentRegistration.java`

**How to Run:**
1. Open the `StudentRegistration` folder in the terminal.
2. Compile the program:
   `javac StudentRegistration.java`
3. Run the program:
   `java StudentRegistration`

### 2. Calculator Using Java Swing with MVC Architecture
**Experiment Name:** Design and Develop a Calculator using Java Swing following MVC Architecture.

**Aim:** To develop a graphical calculator that performs basic arithmetic operations using the Model-View-Controller (MVC) architecture.

**Technologies Used:**
- Java
- Java Swing
- Event Handling
- MVC Architecture

**Repository Contents:**
- `CalculatorModel.java` — Performs arithmetic calculations.
- `CalculatorView.java` — Creates the calculator interface.
- `CalculatorController.java` — Handles button events and connects the Model and View.
- `Main.java` — Starts the application.

**How to Run:**
1. Open the `CalculatorMVC` folder in the terminal.
2. Compile the program:
   `javac *.java`
3. Run the program:
   `java Main`

## Concepts Practiced
- Java classes and objects
- GUI development using Swing
- Event handling
- Model-View-Controller architecture
- Compilation and execution of Java programs

## Author
Ishan Mathur

### 3. JDBC (Java Database Connectivity)

**Project Name:** JDBC Demo

**Aim:** To connect a Java application to a MySQL database, insert student records, and retrieve and display records using JDBC.

**Technologies Used:**
- Java
- JDBC
- MySQL
- MySQL Connector/J
- VS Code

**Main File:** `JdbcProject/JdbcDemo.java`

**Project Contents:**
- `JdbcDemo.java` — Connects to MySQL, inserts a student record, and displays records.
- `lib/` — Contains the MySQL Connector/J driver.
- `README.md` — Documents database setup and execution instructions.

**Database:** `college`

**Table:** `student` with columns `id`, `name`, and `branch`.

**How to Run:**
1. Ensure MySQL Server is running.
2. Create the `college` database and `student` table.
3. Update the MySQL username and password in `JdbcDemo.java`.
4. Open the `JdbcProject` folder in the terminal.
5. Compile and run the program using the instructions in `JdbcProject/README.md`.

**Concepts Practiced:**
- JDBC connectivity
- SQL INSERT and SELECT operations
- PreparedStatement and ResultSet
- Exception handling


### 4. Java RMI – Remote Method Invocation
- **Description:** Demonstrates communication between a Java client and a remote server using Java RMI.
- **Files:** `MyInterface.java`, `MyRemote.java`, `Server.java`, `Client.java`
- **Features:** Remote method invocation and remote addition of two integers.
- **Expected Output:** `Result = 30`
- **Project Folder:** [`RMI/`](RMI/)

### 5. Experiment 5 - Server-Client
- **Aim:** To implement TCP client-server communication using Java.
- **Description:** Demonstrates communication between a client and server using TCP sockets. The client sends a message, and the server responds.
- **Files:** `Server.java`, `Client.java`
- **Concepts:** TCP, sockets, IP address, port number, and Java networking.
- **Project Folder:** [`Experiment 5 - Server-Client/`](Experiment%205%20-%20Server-Client/)