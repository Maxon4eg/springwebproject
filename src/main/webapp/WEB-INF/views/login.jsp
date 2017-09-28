<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <meta name="_csrf" content="${_csrf.token}"/>
    <meta name="_csrf_header" content="${_csrf.headerName}"/>

    <title>Login</title>

    <!-- Bootstrap core CSS -->
    <link href="<c:url value="/resources/bootstrap/css/bootstrap.css"/>" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="<c:url value="/resources/bootstrap/css/signin.css"/>" rel="stylesheet">
</head>

<body>

<div class="container">

    <spring:form modelAttribute="user" action="/j_spring_security_check" class="form-signin">

        <h2 class="form-signin-heading">Please sign in</h2>

        <spring:label path="username" class="sr-only">Username</spring:label>
        <spring:input path="username" class="form-control" placeholder="Username"/>

        <spring:label path="password" class="sr-only">Password</spring:label>
        <spring:input type="password" path="password" class="form-control" placeholder="Password"/>

        <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me"> Remember me
            </label>
        </div>

        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    </spring:form>

    <c:if test="${not empty error}">
        <div class="alert alert-danger" role="alert">
            <p>${error}</p>
        </div>
    </c:if>
    <c:if test="${not empty logout}">
        <div class="alert alert-info" role="alert">
            <p>${logout}</p>
        </div>
    </c:if>

</div> <!-- /container -->

</body>
</html>