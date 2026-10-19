# Java RMI - Remote Method Invocation

## Description
This project demonstrates Java Remote Method Invocation (RMI), which allows a client to call a method on a remote Java object.

## Files
- `MyInterface.java` – Defines the remote interface.
- `MyRemote.java` – Implements the remote method.
- `Server.java` – Creates and registers the remote object.
- `Client.java` – Calls the remote method and displays the result.

## How to Run

Compile the Java files:

```bash
javac *.java
```

Start the RMI Registry on port 1099, then run the server:

```bash
java Server
```

In another terminal, run the client:

```bash
java Client
```

## Expected Output

```text
Result = 30
```

## Technologies Used
- Java
- Java RMI
