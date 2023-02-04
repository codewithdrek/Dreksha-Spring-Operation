<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Confirmation</title>
</head>
<body>
The Student confirmation : ${theStudent.firstName}  

${theStudent.lastName}

<br><br>
Country : ${theStudent.country}

<br><br>
<!-- Step 3 checkList  -->
Operating System:
<!-- Bullet List -->
<ul>
 
 <c:forEach var="temp" iteam="${theStudent.operatingSystem}">
 <li>${temp}</li>
 </c:forEach>
</ul>
</body>
</html>