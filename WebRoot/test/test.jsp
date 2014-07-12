<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>序号</td>
			<td>名字</td>
			<td>年龄</td>
		</tr>
		<c:forEach items="${userList }" var="user">
			<tr>
				<td>${user.userId }</td>
				<td>${user.name }</td>
				<td>${user.age }</td>
			</tr>
		</c:forEach>
	</table>
	

</body>
</html>