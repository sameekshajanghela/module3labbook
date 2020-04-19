<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<marquee><h1>Trainee Management System</h1></marquee>
<style>
table, th ,td {
border: 2px solid black;
}
</style>
</head>
<body bgcolor="silver">
<div align="center">
<table>
<tr>
<th><h2>Pick your operation </h2></th>
</tr>
<tr>
<td><a href="add">Add Trainee</a></td>
</tr>
<br>
<tr>
<td><a href="retrieve">Retrieve Trainee</a></td>
</tr>
<br>
<tr>
<td><a href="delete">Delete Trainee</a></td>
</tr>
<br>
<tr>
<td><a href="fetchall">Fetch All Trainee</a></td>
</tr>
<br>
<tr>
<td><a href="modify">Update Trainee</a></td>
</tr>
</table>
</div>
</body>
</html>
