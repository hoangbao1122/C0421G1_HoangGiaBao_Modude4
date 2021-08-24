<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 8/22/2021
  Time: 8:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/result" method="get">
    <input type="text" name="number1">
    <input type="text" name="number2">
    <br><br>
    <button type="submit" value="Addition" name="phepToan">Addition +</button>

    <button type="submit" value="Subtraction" name="phepToan">Subtraction - </button>
    <button type="submit" value="Multiplication" name="phepToan">Multiplication  * </button>
    <button type="submit" value="Division" name="phepToan">Division  / </button>
</form>
<h4>Result ${result}</h4>

</body>
</html>
