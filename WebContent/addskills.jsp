<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Added Skills</title>
</head>
<body>

	<div align="center">
		<h3>ADDED SKILLS</h3>
	</div>
	<br>
	<br>

	<div align="center">
		<a href="ViewProfile">View Profile</a> &nbsp;&nbsp;
	<a href="UnAddedSkills">Unadded Skills</a> &nbsp;&nbsp;
	<a href="Home">Home</a>&nbsp;&nbsp;
	<a href="logout">Logout</a>
	</div>
	<br>
	<br>

	<div align="center">

		<table border="1" style="width: 300px">
			<tr>
				<th>Skill name</th>
				<th>Action</th>
			</tr>
			<c:forEach var="element" items="${skillsData}">
				<tr>
					<td>${element.skill_name}</td>
					
					<td><a href="DeleteSkills?deleteid=${element.id}"
						Onclick="return confirm('Are you sure want to delete?')">Remove</a>&nbsp;&nbsp;
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>