<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

<body onload='document.f.j_username.focus();' style="background-image: url('images/home1.jpg'); background-repeat:repeat; ">
<c:if test="${not empty param.login_error}">
		<div class="errorblock">
			Your login attempt was not successful, try again.<br /> Reason :
			${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
		</div>
	</c:if>
	<table  border="0" align="right">
		
		<tr>
			<td style="width: 260px;" />

			<td style="width: 300px;">
				<fieldset style="width: 330px; border: 1px solid green">
					<legend
						style="padding: 0.2em 0.5em; border: 3px solid green; color: grey; font-size: 90%; text-align: left;">Login</legend>
					<form name='f' action="j_spring_security_check" method='POST'>
						<table>
							<tr>
								<td></td>
								<td><input type='text' name='j_username' value=''
									placeholder="Username" style="width: 250px;"></td>
							</tr>
							<tr>
								<td></td>
								<td><input type='password' name='j_password'
									placeholder="Password" style="width: 250px;" /></td>
							</tr>
							<tr>
								<td style="height: 20px;" />
							</tr>
							<tr>
								<td></td>
								<td align="right"><input name="submit" type="submit"
									value="Login" /></td>
								<td><input name="reset" type="reset" /></td>
							</tr>
						</table>


					</form>
				</fieldset>
			</td>

			<td style="width: 100px;" />

		</tr>
		
	</table>
	
<!-- this part onward is no longer required 
<div align="center">

	
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
-->

</body>
</html>