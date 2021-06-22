<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${listItems}" var="listItem">
    <a href="/data/${listItem.id}">
        <div>
            <img style="width: 200px; height: 200px;" src="${listItem.thumbnail}" alt="thumbnail"/>
            <h3>${listItem.name}</h3>
            <h3>${listItem.price}</h3>
        </div>
    </a>
</c:forEach>
</body>
</html>
