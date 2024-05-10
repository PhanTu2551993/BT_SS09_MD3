<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Đăng nhập</title>
</head>
<body>
<h1>Đăng nhập</h1>
<form action="LoginServlet" method="post">
    <label for="username">Tài khoản:</label>
    <input type="text" id="username" name="username"><br><br>
    <label for="password">Mật khẩu:</label>
    <input type="password" id="password" name="password"><br><br>
    <button type="submit">Đăng nhập</button>
</form>
<%-- Hiển thị thông báo nếu có --%>
<% String message = (String) request.getAttribute("message"); %>
<% if (message != null) { %>
<p><%= message %></p>
<% } %>
</body>
</html>