<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 8/29/2021
  Time: 3:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p style="color: green">${message}</p>
<form:form modelAttribute="mail" method="post" action="/create">
<table>
    <tr>
        <th>Language</th>
        <th><form:select path="language" items="${language}" multiple="false"/></th>
    </tr>
    <tr>
        <th>Page Size</th>
        <th><form:select path="size" items="${size}" multiple="false"/> </th>
    </tr>
    <tr>
        <th>Spams Fillter</th>
        <th><form:checkbox path="spamFillter" value="false"/></th>
    </tr>
    <tr>
        <th>Signature</th>
        <th><form:input path="signature"/></th>
    </tr>
    <tr>
        <th><input type="submit" value="Create"></th>
    </tr>
</table>
</form:form>
</body>
</html>
