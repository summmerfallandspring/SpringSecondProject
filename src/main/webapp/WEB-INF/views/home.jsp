<%@page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path" value="${pageContext.request.contextPath}" />



<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>게시판</title>
    <link rel="stylesheet" href="${path}/resources/css/style.css">

<body>
<h1>
    Hello World!
</h1>
<p>
    <a href="board/list">게시판으로 이동</a>
</p>
</body>
</html>
