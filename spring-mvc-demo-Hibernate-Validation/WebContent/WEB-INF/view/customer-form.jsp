
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Blank Form</title>
<style>.error {color:red}</style>

</head>
<body>

<i> Fill out the form. Asterisk means fields are mendatory.</i>
<form:form action="processForm" modelAttribute="customer" method="POST">

<br><br>
FirstName:<form:input path="firstName"/>
<br><br>
<!-- Step 2hibernate -->

Last Name (*):<form:input path="lastName"/>
<form:errors path="lastName" cssClass="error"/>


Free Passes (*):<form:input path="freepasses"/>
<form:errors path="freepasses" cssClass="error"/>
<br><br>

Course Code(*) <form:input path="courseCode"/>
<form:errors path="courseCode" cssClass="error"/>
<br><br>


Postal Code(*) <form:input path="postalCode"/>
<form:errors path="postalCode" cssClass="error"/>


<input type="submit" value="Submit"/>
<br><br>

</form:form>

</body>
</html>