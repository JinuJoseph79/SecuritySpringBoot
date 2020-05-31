<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee</title>
</head>
<body>
<h1>Employee List</h1>
<p><a href="/">Home</a></p>
<div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Employees</h2></caption>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Salary</th>
            </tr>
            <c:forEach var="emp" items="${employees}">
                <tr>
                    <td><c:out value="${emp.id}" /></td>
                    <td><c:out value="${emp.name}" /></td>
                    <td><c:out value="${emp.department}" /></td>
                   
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>