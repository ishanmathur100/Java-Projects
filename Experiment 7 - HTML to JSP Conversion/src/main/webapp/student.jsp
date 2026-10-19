
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Information</title>
</head>
<body>
    <h1>Student Information</h1>

    <form action="hello" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required>
        <br><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>
        <br><br>

        <label for="course">Course:</label>
        <input type="text" id="course" name="course" required>
        <br><br>

        <label for="age">Age:</label>
        <input type="number" id="age" name="age" min="1" required>
        <br><br>

        <input type="submit" value="Register">
    </form>
</body>
</html>
