<%-- 
    Document   : Arithmeticcalculator
    Created on : 25-Sep-2022, 6:27:19 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            First: <input type="int" name="first" value="${first}"><br>
            Second: <input type="int" name="second" value="${second}"><br>
            <input type="submit" name="operator" value="+">
            <input type="submit" name="operator" value="-">
            <input type="submit" name="operator" value="*">
            <input type="submit" name="operator" value="%">
        </form>
            
            Result: ${message}
            
            <nav>
                <a href ="age">Age Calculator</a>
            </nav>
    </body>
</html>
