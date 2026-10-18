# JDBC (Java Database Connectivity)

## Aim
To connect a Java application to a MySQL database using JDBC, insert student records, and retrieve and display records from the database.

## Technologies Used
- Java
- JDBC (Java Database Connectivity)
- MySQL 8.0
- MySQL Connector/J
- Visual Studio Code

## Project Structure

```text
JdbcProject/
├── JdbcDemo.java
└── lib/
    └── mysql-connector-j-26.7.0.jar
```

*Note: The JAR file must be placed in the `lib` folder. The exact location should match the classpath used to compile and run the program.*

## Database Setup

Create the database:

```sql
CREATE DATABASE college;
USE college;
```

Create the student table:

```sql
CREATE TABLE student (
    id INT PRIMARY KEY,
    name VARCHAR(30),
    branch VARCHAR(20)
);
```

## Program Description

- Establishes a connection to the MySQL database.
- Uses `PreparedStatement` to insert a student record.
- Uses `Statement` and `ResultSet` to retrieve student records.
- Displays the student ID, name, and branch.
- Handles SQL errors using `SQLException`.

## How to Compile and Run

Open a terminal in the `JdbcProject` directory.

Compile the program:

```powershell
javac -cp ".;lib\mysql-connector-j-26.7.0\mysql-connector-j-26.7.0\mysql-connector-j-26.7.0.jar" JdbcDemo.java
```

Run the program:

```powershell
java -cp ".;lib\mysql-connector-j-26.7.0\mysql-connector-j-26.7.0\mysql-connector-j-26.7.0.jar" JdbcDemo
```

*The classpath above matches the current nested JAR location. If the JAR is moved directly into `lib`, update the classpath accordingly.*

## Expected Output

```text
Record Inserted
101 Rahul CSE
```

The output assumes student ID `101` does not already exist in the table.

## Concepts Practiced
- JDBC driver loading and database connectivity
- `Connection` and `DriverManager`
- `PreparedStatement` and parameter binding
- SQL `INSERT` and `SELECT` operations
- `ResultSet` traversal
- Exception handling and resource management

## Author
Ishan Mathur