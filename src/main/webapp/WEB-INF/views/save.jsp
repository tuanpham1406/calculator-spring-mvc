<%--
  Created by IntelliJ IDEA.
  User: aya
  Date: 27/05/2019
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="result" method="post">
    <h1>Calculator</h1>
    <input type="text" name="first">
    <input type="text" name="second"><br/><br/>
    <input type="submit" value="Addition(+)" name="xxx">
    <input type="submit" value="Subtraction(-)" name="xxx">
    <input type="submit" value="Multiplication(X)" name="xxx">
    <input type="submit" value="Division(/)" name="xxx">
    <h3>Result: ${result}</h3>
</form>
</body>
</html>
