<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter the party details</title>
</head>
<body style="background-color:powderblue;">
	<h1>Party</h1>
	<form:form method="POST" modelAttribute="party">
		<table>
			<tr>
				<td><label>Host First Name</label></td>
				<td><form:input type="text" path="firstName" id="firstName" />
					<%--  <form:errors path="firstName" style="color:red" /></td>--%>
			</tr>
			<tr>
				<td><label>Last Name</label></td>
				<td><form:input type="text" path="lastName" id="lastName" /> <form:errors
						path="lastName" style="color:red" /></td>
			</tr>
			<tr>
				<td><label>Number Of Persons </label></td>
				<td><form name="personNumber">
						<input type="range" name="personNumber" id="personNumber" path="personNumber" value="5"
							min="1" max="100" oninput="personNumberOut.value = personNumber.value">
						<output name="personNumberOut" id="personNumberOut">5</output>
					</form></td>
			</tr>
			<tr>
				<td><label>Date of Party</label></td>
				<td><form:input type="date" path="functiondate" id="functiondate" /> <form:errors
						path="functiondate" style="color:red" /></td>
			</tr>
				<tr>
				<td><label>Number Of Plate</label></td>
				<td><form:input type="range" path="noOfplates" id="noOfplates" name="noOfplates" value="5"
							min="1" max="100" oninput="noOfplatesOut.value = noOfplates.value"/>
							<output name="noOfplatesOut" id="noOfplatesOut">5</output> <form:errors
						path="noOfplates" style="color:red" /></td>
			</tr>
			<tr>
				<td><label>Email</label></td>
				<td><form:input type="email" path="email" id="email" /> <form:errors
						path="email" style="color:red" /></td>
			</tr>
			<tr>
				<td><label>Party Type</label></td>
				<td><form:select path="partyType" id="partyType">
						<form:option value="">Select party</form:option>
						<form:options items="${TypeInfo}" />
					</form:select> <form:errors path="partyType" style="color:red" /></td>
			</tr>
			<tr>
				<td><label>Plate Type</label></td>
				<td><form:select path="typePlate" id="typePlate">
						<form:option value="">Select Plate Size</form:option>
						<form:options items="${typeOfPlate}" />
					</form:select> <form:errors path="typePlate" style="color:red" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>