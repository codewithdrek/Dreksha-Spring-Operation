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

<i> Fill out the form. Asterisk means fileds are mendatory.</i>
<form:form action="processForm" modelArribute="customer">

<br><br>
FirstName:<form:input path="firstName"/>
<br><br>
<!-- Step 2hibernate -->

Last Name (*):<form:input path="lastName"/>
<form:error path="lastName" cssClass="error"/>


Free Passes (*):<form:input path="freePasses"/>
<form:error path="freePasses" cssClass="error"/>
<br><br>

Postal Code(*) <form:input path=postalCode/>
<form:error path="postalCode" cssClass="error"/>

<br><br>
Course Code(*) <form:input path=courseCode/>
<form:error path="courseCode" cssClass="error"/>

<br><br>
<input: type ="submit" value="Submit"/>

</form:form>

</body>
</html>