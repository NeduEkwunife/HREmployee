<%@ page import="com.acn.training.utilities.UserCredential, com.acn.training.model.Role" %>
<!DOCTYPE html>
<html>
<head>
<title>Welcome Page</title>
<style>
.errorblock {
	color: #ff0000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
</head>

<body  style="background-image: url('images/home.jpg'); background-repeat:no-repeat; background-position:55% -40%;">
<div align="center">
<h3>WELCOME, TO HR MANAGER</h3>
	
	<% //get value sent by Home servlet
  UserCredential cre = (UserCredential)request.getAttribute("sessData");
   if (cre != null && cre.getRole() != null && cre.getRole().getName().equals("Employee")){ %>
	<a href="user.jsp"> <%= cre.getName() %> </a><br>
	<a href="logout">Logout</a>
	<% //close the if statement  
   } else if (cre != null && cre.getRole() != null && (cre.getRole().getName().equals("HR") || cre.getRole().getName().equals("SuperAdmin"))){ %>
	<a href="admin.jsp"><%= cre.getName() %></a><br>
	<a href="logout">Logout</a>
	<% //close the if statement  
   } else { %>
    <a href="login.jsp">Login</a>
    <% //close the if statement 
   }%>
</div>

</body>
</html>