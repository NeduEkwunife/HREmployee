<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Users</title>
</head>
<body>

<div align="center">
<h3>VIEW REGISTERED USERS</h3>
</div><br><br>
	
	<div align="center">
	<a href="adduser.jsp">Add Users</a>&nbsp;&nbsp;
	<a href="EditUsers">Edit Users</a>&nbsp;&nbsp;
	<a href="Home">Home</a>&nbsp;&nbsp;
	<a href="logout">Logout</a>
	</div><br><br>

<div align="center">	
<table border="1" style="width:300px">
<tr>
  <th>First name</th>
  <th>Last name</th>
  <th>Email</th>
  <th>Enabled</th> 
  <th>Role</th>
  <th>Summary</th>
  <th>Available</th>
</tr>
    <c:forEach var="element" items="${listData}">
        <tr>
            <td>${element.firstname}</td> 
            <td>${element.lastname}</td> 
            <td>${element.email}</td> 
            <td>${element.enabled}</td>
            <td>${element.getRole().getName()}</td>
            <td>${element.summary}</td>
            <td>${element.available}</td>
        </tr> 
    </c:forEach>
</table>
</div>
</body>
</html>