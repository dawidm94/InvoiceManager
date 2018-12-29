<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../fragments/header.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--<h1>Lista faktur!</h1>--%>
<%--<br/><br/>--%>
<%--<ul>--%>
<%--<c:forEach items="${invoices}" var="invoice">--%>
	<%--<li>${invoice}</li>--%>
<%--</c:forEach>--%>
<%--</ul>--%>
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
<div class="container">
	<div class="row">
		<div class="col-12">
			<p class="p-3">
				<h1 align="center">Faktury</h1>
			</p>
		</div>
			<table class="table table-sm table-bordered">
				<tr>
					<th>Lp.</th>
					<th>Numer faktury</th>
					<th>Nabywca</th>
					<th>Kwota</th>
					<th></th>
				</tr>
				<c:forEach items="${invoices}" var="invoice" varStatus="loop">
				<tr>
					<td>${loop.index+1}</td>
					<td>${invoice.invoiceNumber}</td>
					<td>${invoice.company.name}</td>
					<td>${invoice.totalGrossSum} zł</td>
					<td>
						<button class="btn btn-sm btn-secondary">Wyświetl</button>
						<a class="btn btn-sm btn-secondary" href="/invoice/generate/${invoice.id}">Pobierz</a>
					</td>
				</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</div>

<%@ include file="../fragments/footer.jsp" %>
