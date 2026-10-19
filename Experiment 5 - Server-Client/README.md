# Experiment 5 - Server Client

## Aim
To implement TCP client-server communication using Java networking.

## Description
This experiment demonstrates communication between a client and a server using Java TCP sockets. The client sends a message to the server, and the server responds with a reply.

## Files
- `Server.java` – Accepts a client connection, receives a message, and sends a response.
- `Client.java` – Connects to the server, sends a message, and receives the response.

## Technologies Used
- Java
- `java.net` package
- `java.io` package
- TCP sockets

## How to Run

### 1. Compile the programs
```bash
javac Server.java Client.java
```

### 2. Start the server
Open the first terminal and run:
```bash
java Server
```

### 3. Start the client
Open a second terminal and run:
```bash
java Client
```

## Expected Client Output
```text
Connected to server.
Server says: Hello Client
Connection closed.
```

## Expected Server Output
```text
Server started...
Waiting for client...
Client connected.
Client says: Hello Server
Connection closed.
```

## Concepts Covered
- Client-server architecture
- TCP communication
- IP address and port number
- `Socket` and `ServerSocket`
- Input and output streams
