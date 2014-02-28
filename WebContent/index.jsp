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
.button
{
	background-color:#6B2400;
	width:105px;
    height: 30px;
     text-transform: none;
    border:1px solid transparent;
    color:white;
    font-weight:bold;
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
	<table  align="right" style="border: none;" cellspacing="0" cellpadding="0">
		
		<tr>
			<td style="width: 260px;" />

			<td style="width: 300px;border: none;" >
				<fieldset style="width: 330px;border:none">
					
					<form name='f' action="j_spring_security_check" method='POST'>
						<table>
							<tr>
								
								<td><input type='text' name='j_username' value=''
									placeholder="Username" style="width: 250px;"></td>
							</tr>
							<tr>
								
								<td><input type='password' name='j_password'
									placeholder="Password" style="width: 250px;" /></td>
							</tr>
							<tr>
								<td style="height: 20px;" />
							</tr>
							<tr>
								
								<td style="width: 105px;" ><input class="button" name="submit" type="submit"
									value="Login" >
								<input class="button" name="reset" type="reset" /></td>
							</tr>
						</table>


					</form>
				</fieldset>
			</td>

			<td style="width: 100px;" />

		</tr>
		
	</table>
	
	<!--  
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
    <a href="login.jsp"></a>
    <% //close the if statement 
   }%>
</div>
-->

</body>
</html>