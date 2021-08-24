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

<form action="/save" method="get">

    <input type="checkbox" value="lettuce" name="sanwich"> lettuce
    <input type="checkbox" value="tomato" name="sanwich">tomato
    <input type="checkbox" value="mustard" name="sanwich">mustard
    <input type="checkbox" value="sprouts" name="sanwich">sprouts
    <button type="submit">Save</button>
    <h4 style="color: #0000ff">Result </h4> <h4>${save}</h4>
</form>

</body>
</html>
