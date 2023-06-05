<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Admin Profile</title>
</head>
<body>
    <h2>Admin Profile</h2>
    <p>Username: admin</p>
    <p>Email: admin@example.com</p>
    <form method="post" action="AdminProfileServlet">
        <label for="password">New Password:</label>
        <input type="password" id="password" name="password"><br><br>
        
        <input type="submit" value="Change Password">
    </form>
</body>
</html>
