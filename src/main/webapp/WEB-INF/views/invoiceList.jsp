<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../fragments/header.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>Lista faktur!</h1>
<br/><br/>
<ul>
<c:forEach items="${invoices}" var="invoice">
	<li>${invoice}</li>
</c:forEach>
</ul>
<%@ include file="../fragments/footer.jsp" %>
