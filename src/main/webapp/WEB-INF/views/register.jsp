<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: akhambir
  Date: 07.09.17
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <meta name="_csrf" th:content="${_csrf.token}"/>

    <title>Register</title>

    <!-- Bootstrap core CSS -->
    <link href="<c:url value="/resources/bootstrap/css/bootstrap.css"/>" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="<c:url value="/resources/bootstrap/css/signin.css"/>" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>

<body>

<div class="container">

    <spring:form modelAttribute="user" method="post" action="/register" class="form-signin">

        <h2 class="form-signin-heading">Please register</h2>

        <spring:label path="username" class="sr-only">Username</spring:label>
        <spring:input data-field="name" id="username" path="username" class="form-control" placeholder="Username"/>
        <span class="username-response" style="display: none"></span>

        <spring:label path="password" class="sr-only">Password</spring:label>
        <spring:input type="password" path="password" class="form-control" placeholder="Password"/>

        <spring:label path="email" class="sr-only">Password</spring:label>
        <spring:input data-field="email" id="email" type="email" path="email" class="form-control" placeholder="Email"/>
        <span class="email-response" style="display: none"></span>

        <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me"> Remember me
            </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    </spring:form>

</div> <!-- /container -->
<script src="/resources/bootstrap/js/main.js"></script>
</body>
</html>