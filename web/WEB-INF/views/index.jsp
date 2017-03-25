
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>
  <title>Index Page</title>
</head>

<body>
<spring:form method="post"  modelAttribute="buyerJSP" action="check-buyer">

  <tr><td>Name:</td> <td><spring:input path="name"/> </td>
  <td> <spring:errors path="name" cssStyle="color: red;"/></td> </tr>
  <td>Age: <spring:input path="age"/>   <td/>
  <td>Direction: <spring:input path="direction"/>   <td/>
  <tr> <td>  Date :</td> <td><spring:input path="date"/> </td>
  <td> <spring:errors path="date" cssStyle="color: red;"/> </td> </tr>
  <tr> <td>  Email :</td> <td><spring:input path="email"/> </td>
  <td> <spring:errors path="email" cssStyle="color: red;"/> </td> </tr>
  <td>Price: <spring:input path="price"/>   <td/>
  <spring:button>Next Page</spring:button>

</spring:form>

</body>

</html>
