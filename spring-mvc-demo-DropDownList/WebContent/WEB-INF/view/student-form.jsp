<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html>
<head>
 <title>Student Registration Form</title>
</head>

<body>
 <form:form action="processForm" modelAttribute="theStudent">
<br><br>

 Countries:
 <form:select path= "country" >
  <form:options items = "${theStudent.countryOptions}" />
 </form:select>
 <input type="submit" value="Submit"/>
 <br><br>
</form:form>

</body>
</html>