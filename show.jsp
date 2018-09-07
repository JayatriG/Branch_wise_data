<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Required List</title>
</head>
<body>
<h1>
 Students of branch <%=request.getAttribute("branch") %></h1>
 

 <% 
 String student_list= new String();
 student_list = request.getAttribute("stud").toString();
 out.println(student_list);
 %>

</body>
</html>