<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>

<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Login</title>

    <!-- Bootstrap core CSS -->
    <link href="<c:url value="/resources/bootstrap/css/bootstrap.css"/>" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="<c:url value="/resources/bootstrap/css/signin.css"/>" rel="stylesheet">
</head>

<body>

<div class="container">

    <spring:form modelAttribute="user" method="post" action="/login" class="form-signin">

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
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    </spring:form>

</div> <!-- /container -->

</body>
</html>