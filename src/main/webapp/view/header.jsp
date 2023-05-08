<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.time.LocalDate"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>header</title>
</head>
<body>
	<header>
		<h3 style="text-align:right">
			<%=LocalDate.now() %>
		</h3>
		<h2 style="border-bottom:2px solid black">Spring Boot Web Application</h2>
	
	</header>
	<nav>
		<a href="home">Home</a>
	</nav>

