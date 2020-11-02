<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/10/30
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>测试</h3>
<a href="account/findAll">测试</a>
<form action="account/save" method="post">
    姓名：<input type="text" name="name"/><br>
    金额：<input type="text" name="money"><br>
    <input type="submit" value="保存">

</form>
</body>
</html>
