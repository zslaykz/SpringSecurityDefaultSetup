<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="tmp/header.jsp"%>


login page
<br>

<c:url var="xxx" value="/login"/>

<form action="${xxx}" method="post">
        <input type="text" name="username" placeholder="userename"/>
        <input type="password" name="password" placeholder="password"/>
        <input type="submit" value="login">
</form>

<%@include file="tmp/footer.jsp"%>
