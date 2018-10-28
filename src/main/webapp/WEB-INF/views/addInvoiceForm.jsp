<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../fragments/header.jsp" %>
<div class="container">
	<div class="row justify-content-lg-center">
		<div class="col col-lg-12" style=" margin-top: 20px" align="center">
			<h1>Faktura VAT nr:</h1>
			<h2 style="display: inline-block">1/10/2018</h2> <a href="#"><sub>edytuj</sub></a>
			<hr style="size: 10px;background-color: black">
			<h2>Nabywca: <button class="btn btn-sm btn-secondary "data-toggle="modal" data-target="#exampleModal">Wybierz</button></h2>
			<div class="container">
				<div class="row">
					<div class="col col-lg-3 offset-lg-2">
						<div class="input-group mb-3">
							<div class="input-group-prepend">
								<span class="input-group-text">NIP:</span>
							</div>
							<input disabled type="text" class="form-control" aria-label="Nip" aria-describedby="basic-addon1">
						</div>
					</div>
					<div class="col col-lg-5">
						<div class="input-group mb-3">
							<div class="input-group-prepend">
								<span class="input-group-text">Nazwa:</span>
							</div>
							<input disabled type="text" class="form-control" aria-label="Name" aria-describedby="basic-addon1">
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col col-lg-8 offset-lg-2">
						<div class="input-group mb-3">
							<div class="input-group-prepend">
								<span class="input-group-text">Ulica :</span>
							</div>
							<input disabled type="text" class="form-control" aria-label="Address" aria-describedby="basic-addon1">
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col col-lg-3 offset-lg-2">
						<div class="input-group mb-3">
							<div class="input-group-prepend">
								<span class="input-group-text">Kod pocztowy:</span>
							</div>
							<input disabled type="text" class="form-control" aria-label="postal_code" aria-describedby="basic-addon1">
						</div>
					</div>
					<div class="col col-lg-5">
						<div class="input-group mb-3">
							<div class="input-group-prepend">
								<span class="input-group-text">Miasto:</span>
							</div>
							<input disabled type="text" class="form-control" aria-label="city" aria-describedby="basic-addon1">
						</div>
					</div>
				</div>
			</div>
			<hr style="size: 10px;background-color: black">
		</div>
	</div>
</div>

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="exampleModalLabel">Wybierz klienta:</h5>
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body">
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<span class="input-group-text" id="basic-addon1">Wyszukaj</span>
					</div>
					<input type="text" class="form-control" placeholder="NIP / Nazwa" aria-label="Username" aria-describedby="basic-addon1">
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-secondary" data-dismiss="modal">Zamknij</button>
				<button type="button" class="btn btn-primary">Wybierz</button>
			</div>
		</div>
	</div>
</div>

<%@ include file="../fragments/footer.jsp" %>
