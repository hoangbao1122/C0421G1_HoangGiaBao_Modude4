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
<form action="/convert"method="post">
    <h1>Đổi tiền từ usd -> vnd</h1>
    <input type="text" name="usd">
    <input type="submit" value="Tính">
    <h1>kết quả ${convertUsd}</h1>
</form>

</body>
</html>
