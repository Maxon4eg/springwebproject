<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: maxon4eg
  Date: 17.08.17
  Time: 21:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1>Login!!!</h1>

    <spring:form modelAttribute="user" method="post" action="/login">

        <spring:input path="username" />

    </spring:form>
</body>
</html>
