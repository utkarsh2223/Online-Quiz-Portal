<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Create Quiz</title>
</head>
<body>
    <h2>Create Quiz</h2>
    <form method="post" action="QuizManagementServlet">
        <label for="quizName">Quiz Name:</label>
        <input type="text" id="quizName" name="quizName"><br><br>
        
        <label for="question1">Question 1:</label>
        <input type="text" id="question1" name="question1"><br><br>
        <label for="option1">Option 1:</label>
        <input type="text" id="option1" name="option1"><br><br>
        <label for="option2">Option 2:</label>
        <input type="text" id="option2" name="option2"><br><br>
        <label for="option3">Option 3:</label>
        <input type="text" id="option3" name="option3"><br><br>
        <label for="option4">Option 4:</label>
        <input type="text" id="option4" name="option4"><br><br>
        <label for="correctOption">Correct Option:</label>
        <input type="text" id="correctOption" name="correctOption"><br><br>
        
        <input type="submit" value="Create Quiz">
    </form>
</body>
</html>
