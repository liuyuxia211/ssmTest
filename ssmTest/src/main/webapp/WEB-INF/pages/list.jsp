<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/10/30
  Time: 20:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>查询所有用户</h3>
${list}
<c:forEach items="${list}" var="account">
    ${account}
</c:forEach>
</body>
</html>
