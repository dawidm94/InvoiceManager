<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../fragments/header.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h1 align="center">Dodaj nowego klienta</h1>
<br/>
<div class="container">
	<form:form modelAttribute="company" method="POST">
	<div class="row">
		<div class="col col-lg-7 offset-lg-2">
			<div class="input-group mb-3">
				<div class="input-group-prepend">
					<span class="input-group-text">NIP:</span>
				</div>
				<form:input path="nip" type="text" class="form-control" required="required"/>
				<div class="input-group-append">
					<button class="btn btn-secondary" disabled type="button" id="button-addon2">Pobierz dane z GUS</button>
				</div>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col col-lg-7 offset-lg-2">
			<div class="input-group mb-3">
				<div class="input-group-prepend">
					<span class="input-group-text">Nazwa:</span>
				</div>
				<form:input path="name" type="text" class="form-control" required="required"/>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col col-lg-7 offset-lg-2">
			<div class="input-group mb-3">
				<div class="input-group-prepend">
					<span class="input-group-text">Ulica :</span>
				</div>
				<form:input path="streetAddress" type="text" class="form-control" required="required"/>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col col-lg-3 offset-lg-2">
			<div class="input-group mb-3">
				<div class="input-group-prepend">
					<span class="input-group-text">Kod pocztowy:</span>
				</div>
				<form:input path="postalCode" type="text" class="form-control" required="required"/>
			</div>
		</div>
		<div class="col col-lg-4">
			<div class="input-group mb-3">
				<div class="input-group-prepend">
					<span class="input-group-text">Miasto:</span>
				</div>
				<form:input path="city" type="text" class="form-control" required="required"/>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col col-lg-7 offset-lg-2">
			<button class="btn btn-success" style="width: 100%;">Dodaj</button>
		</div>
	</div>
	</form:form>
</div>
<%@ include file="../fragments/footer.jsp" %>
