<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: samael
  Date: 12.09.18
  Time: 10:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2 align="center">Welcome to Pet Hotel!</h2>
<form method="post">
    Filter hotels by cities <select name="city">
    <c:forEach var="city" items="${citiesList}">
        <option value="${city}">${city}</option>
    </c:forEach>
</select>

    <%-- 		<form:select path="hotel1.addressCity" items="${availableHotels}"
        itemValue="addressCity" label="please select" itemLabel="addressCity"></form:select>
--%>
    <input type="submit" />
</form>

<c:choose>
    <c:when test="${cityHotels == null}">
    </c:when>
    <c:otherwise>

    </c:otherwise>
</c:choose>
</body>
</html>
