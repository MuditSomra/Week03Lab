<%-- 
    Document   : AgeCalculator
    Created on : 23-Sep-2022, 2:51:00 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body> <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="text" name="age" value=""><br>
            <input type="submit" value="Age next birthday">
        </form>
        <p>${ageIntVal}</p>
        <p>${ageEmpty}</p>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
