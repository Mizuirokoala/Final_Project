<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@	taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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