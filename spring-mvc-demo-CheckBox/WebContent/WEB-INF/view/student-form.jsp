<%@ taglib prefix="form"  uri ="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Student Blank Form</title>
</head>


<body>

<form:form action="processForm" modelAttribute="student" method="POST">

FirstName:<form:input path="firstName"/>
<br><br>

Last Name :<form:input path="lastName"/>
<br><br>

<br><br>
<form:select path= "country">

Countries:
<form:option value = "Brazil" label="brazil" />
<form:option value="India" label="india"/>
<!-- <form options  iteams="${theStudent.contryOption}" -->
</form:select>


<!-- Step 1 CheckBox Operating System -->
Operating System:
Linux<form:checkbox path="operatingSystem" value ="Linux"/>
Mac Os<form:checkbox path="operatingSystem" value ="MacOs"/>
Ms Window<form:checkbox path="operatingSystem" value ="Ms Window"/>

<input type="submit" value="Submit"/>
<br><br>


</form:form>

</body>
</html>