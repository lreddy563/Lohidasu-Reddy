<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="addStudent" method="post" commandName="student">
		<table>
			<tr>
				<td><spring:message code="firstName" /></td>
				<td><form:input path="firstName" /></td>
				<td><form:errors path="firstName" cssStyle="color:red" /></td>
			</tr>
			<tr>
				<td><spring:message code="lastName" /></td>
				<td><form:input path="lastName" /></td>
				<td><form:errors path="lastName" cssStyle="color:red" /></td>
			</tr>
			<tr>
				<td><spring:message code="course" /></td>
				<td><form:input path="course" /></td>
				<td><form:errors path="course" cssStyle="color:red" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form:form>
</body>
