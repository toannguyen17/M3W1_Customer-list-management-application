<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<%@ page import="java.util.List" %>
<%@ page import="com.model.Customer" %><%--
  Created by IntelliJ IDEA.
  User: vuanh
  Date: 7/3/20
  Time: 10:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
	<title>Title</title>
</head>
<body>
<% List<Customer> customers = (List<Customer>) request.getAttribute("custommer"); %>
<h1><%=customers.size()%> customer(s) in list.</h1>
${requestScope.custommer.size}
<span>${ten}</span>
</body>
</html>
