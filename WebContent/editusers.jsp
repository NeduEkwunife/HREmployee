<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Users</title>
<style type="text/css" media="screen">
#logout
{
	text-decoration:none;
	color:#6B2400;
	font-size:18px;
}
#menu ul
{
	margin:0;
	padding:0;
	list-style: none;
	font-family:"Myriad Pro", "Trebuchet MS", sans-serif;
	font-size:18px;
	width:1020px;
	
	
}

#menu a{
	text-decoration:none;
	outline:none;
	img-src:images/add-user.png;
}


li{
	float:left;
	width:170px;
	height:85px;
	position:relative;
	cursor:pointer;
	display:inline;
	
	
}
#menu a:link
{
	display:block;
	background-color:#6B2400;
	color:white;
	text-decoration:none;
	width:120px;
	height:120px;
	text-align:center;
	padding:4px;
	font-weight:bold;
	border-radius:25px;
	
}
a.add
{
	content:url('images/add-user.png');
}
a.edit
{
	content:url('images/edit-user.png');
}
a.view
{
	content:url('images/user.png');
}
a.home
{
	content:url('images/home.png');
}
#menu p
{
	margin-top:45px;
	color:white;
}
.auto-style2 {
	text-align: left;
}
.auto-style3 {
	text-align: left;
	margin-left: 0;
}
.auto-style4 {
	text-align: center;
}
.auto-style5 {
	text-align: center;
	color: #B532E5;
}
</style>

</head>
<body style="background-color: #E6B85C; ">
<div align="right"><a href="logout" id="logout"><p>Logout</p></a></div>
<div class="auto-style2">
<h3 class="auto-style5">ADMIN -&gt; Edit Registered Users</h3>
	
	<p class="auto-style4">Please use the links below to navigate your way 
	through this application.<o:p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </o:p>
	</p>
<div align="center" id="menu">
<ul class="auto-style3" style="width: 510px">

<li><a href="admin.jsp" class="home"><p>HOME</p></a>&nbsp;&nbsp;</li>
<li><a href="ViewUsers" class="view"><p>VIEW USERS</p></a> &nbsp;&nbsp;</li>
<li><a href="adduser.jsp" class="add"><p>ADD USERS</p></a>
<div class="auto-style4">
	&nbsp;&nbsp;</div>
	</li>

	</div>

	<br>
	<br>
<br>
	<br>
	<br><br>
	<br>
	<br>
	<br>
	
	

	<div align="center">	
<table border="1" style="width:800px" cellpadding="2" cellspacing="2" align="center">
			<tr>
				<th class="auto-style4">First name</th>
				<th class="auto-style4">Last name</th>
				<th class="auto-style4">Email</th>
				<th class="auto-style4">Enabled</th>
				<th class="auto-style4">Role</th>
				<th class="auto-style4">Summary</th>
				<th class="auto-style4">Available</th>
				<th class="auto-style4">Action</th>
			</tr>
			
			<c:forEach var="element" items="${listData}">
				<tr>
					<td class="auto-style4">${element.firstname}</td>
					<td class="auto-style4">${element.lastname}</td>
					<td class="auto-style4">${element.email}</td>
					<td class="auto-style4">${element.enabled}</td>
					<td class="auto-style4">${element.getRole().getName()}</td>
					<td class="auto-style4">${element.summary}</td>
					<td class="auto-style4">${element.available}</td>
					<td class="auto-style4"><a href="DeleteUsers?deleteid=${element.id}"
						Onclick="return confirm('Are you sure want to delete?')">Delete</a>&nbsp;&nbsp;
						<a href="DeleteUsers?editid=${element.id}"
						Onclick="return confirm('Are you sure want to edit?')">Edit</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>