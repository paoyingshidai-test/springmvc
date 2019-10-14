<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>第一个 JSP 程序</title>
</head>
<body>

    <p>
        ${name}
    </p>

    <p>
        ${roles}
    </p>

    <c:forEach var="item" items="${roles}">
        <p>角色：  <c:out value="${item}"/><p>
    </c:forEach>

</body>
</html>