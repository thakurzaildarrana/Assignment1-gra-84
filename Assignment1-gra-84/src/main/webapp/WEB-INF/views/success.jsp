<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Done</title>
</head>
<h1>${success}</h1>
<body>
	<table>
		<tr>
			<td><label>Host First Name :</label></td>
			<td>${party.firstName}</td>
		</tr>
		<tr>
			<td><label>Last Name:</label></td>
			<td>${party.lastName}</td>
		</tr>
		<tr>
			<td><label>Number oF Person :</label></td>
			<td>${party.personNumber}</td>
		</tr>
		<tr>
			<td><label>Date of function :</label></td>
			<td>${party.functiondate}</td>
		</tr>
		<tr>
			<td><label>Number Of Plates :</label></td>
			<td>${party.noOfplates}</td>
		</tr>
		<tr>
			<td><label>Email:</label></td>
			<td>${party.email}</td>
		</tr>
		<tr>
			<td><label>Type Of Party :</label></td>
			<td>${party.partyType}</td>
		</tr>
		<tr>
			<td><label>Type Of Plate :</label></td>
			<td>${party.typePlate}</td>
		</tr>
		<tr>
			<td><label>Total Amount :</label></td>
			<td>${party.totalCount}</td>
		</tr>
	</table>
</body>
</html>
