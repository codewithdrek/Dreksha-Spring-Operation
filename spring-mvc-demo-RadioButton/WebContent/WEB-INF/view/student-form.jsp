<%@ taglib prefix="form"  uri ="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Blank Form</title>
</head>
<body>


<form:form action="processForm" modelArribute="theStudent">

<!-- Radio Step 1 -->
<!--  favoriteLanguage is same as model Attribute -->
Favorite Langauge:
<br><br>

JAVA <form:radiobutton path="favoriteLanguage" value="Java"/>
C# <form:radiobutton path="favoriteLanguage" value="C#"/>

<input type="submit" value="Submit"/>

</form:form>

</body>
</html>