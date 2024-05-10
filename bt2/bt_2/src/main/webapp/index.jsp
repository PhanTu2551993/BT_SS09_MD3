<%@ page import="ra.bt_2.UserData" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Data</title>
</head>
<body>
<h1>User Data</h1>
<% UserData userData = (UserData) request.getAttribute("userData"); %>
<% if (userData != null) { %>
<p><strong>ID:</strong> <%= userData.getId() %></p>
<p><strong>Name:</strong> <%= userData.getName() %></p>
<p><strong>Email:</strong> <%= userData.getEmail() %></p>
<p><strong>Age:</strong> <%= userData.getAge() %></p>
<% } else { %>
<p>Không tìm thấy thông tin người dùng.</p>
<% } %>

<form action="UserDataServlet" method="post">
    <input type="hidden" name="showUserData" value="true">
    <button type="submit">Hiển thị thông tin</button>

</form>
</body>
</html>
