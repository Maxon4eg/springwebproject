<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: akhambir
  Date: 09.09.17
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Categories</title>
</head>
<body>
    <h1>Categories</h1>



    <c:forEach items="${categories}" var="c">
        <h2><a href="<c:url value="/category?c_name=${c.categoryName}"/>">${c.categoryName}</a></h2>
    </c:forEach>

</body>
</html>
