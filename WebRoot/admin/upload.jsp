<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="/admin/uploadfile" method="post" enctype="multipart/form-data">
	<input type="file" name="uploadfile" value="apk文件"/> 
	<input type="file" name="preview" value="预览图片"/>
	<input type="file" name="thumbnail" value="缩略图"/>
	<input type="submit" name="upload" value="上传"/>
</form>
<table>
	<c:if test="${!empty fileinfo}">
		<tr><td>序号</td><td>名字</td><td>操作</td></tr>
		<c:forEach items="${fileinfo }" var="file">
			<tr><td>${file.id }</td><td><input type="text" value="${file.name }"></td><td><a href="/admin/downloadfile/${file.id }">下载</a></td></tr>
		</c:forEach>
	</c:if>
</table>

</body>
</html>