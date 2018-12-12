<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../fragments/header.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
	.table {
		border: 0.5px solid #000000;
	}
	.table-bordered > thead > tr > th,
	.table-bordered > tbody > tr > th,
	.table-bordered > tfoot > tr > th,
	.table-bordered > thead > tr > td,
	.table-bordered > tbody > tr > td,
	.table-bordered > tfoot > tr > td {
		border: 0.5px solid #000000;
	}
</style>
<p class="p-3" align="center">
	<a href="add"><button class="btn btn-success"> Nowy klient</button></a>
</p>
<table class="table table-hover table-bordered">
	<tr>
		<th>Lp.</th>
		<th>Nazwa</th>
		<th>NIP</th>
		<th>Ulica</th>
		<th>Kod</th>
		<th>Miasto</th>
	</tr>
	<c:forEach items="${companies}" var="company" varStatus="loop">
		<tr>
		<td>${loop.index+1}</td>
		<td>${company.name}</td>
		<td>${company.nip}</td>
		<td>${company.streetAddress}</td>
		<td>${company.postalCode}</td>
		<td>${company.city}</td>
		</tr>
	</c:forEach>
</table>
<%@ include file="../fragments/footer.jsp" %>
