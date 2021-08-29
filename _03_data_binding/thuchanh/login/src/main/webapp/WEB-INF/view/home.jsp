<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<form:form action="login" method="post" modelAttribute="login">
    <table>
        <tr>
            <th>
                Account
            </th>
            <th>
                <form:input path="username"/>
            </th>

        </tr>
        <tr>
            <td>Pass</td>
            <td><form:input path="pass"/></td>
        </tr>
        <tr>
            <td></td>
            <td><form:button>login</form:button></td>
        </tr>
    </table>
</form:form>

</body>
</html>
