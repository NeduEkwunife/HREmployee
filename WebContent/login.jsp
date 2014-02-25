<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Login Page</title>
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
<body onload='document.f.j_username.focus();' style="background-image: url('images/login.gif'); background-repeat:no-repeat; background-position:55% -10%;">
	<c:if test="${not empty param.login_error}">
		<div class="errorblock">
			Your login attempt was not successful, try again.<br /> Reason :
			${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
		</div>
	</c:if>
	<table width="100%" border="0">
		<tr>
			<td colspan="3" style="height: 180px;" />
		</tr>
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
		<tr>
			<td colspan="3" style="height: 300px;">
				<center>Copyright © 2014 Accenture UK Software Engineering Trainees</center>
			</td>
		</tr>
	</table>
</body>
</html>