<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>BMI Calculator</title>
</head>
<body>
<h1>BMI Calculator</h1>
<form action="BMIServlet" method="post">
    <label for="height">Height (m) :</label>
    <input type="text" id="height" name="height" required><br><br>
    <label for="weight">Weight (kg) :</label>
    <input type="text" id="weight" name="weight" required><br><br>
    <button type="submit">Check BMI</button>
</form>
</body>
</html>