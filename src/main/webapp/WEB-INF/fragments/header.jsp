<%@ page contentType="text/html; charset=UTF-8" %>
<html lang="pl">
<head>
	<title>Fakturowo</title>
	<!-- Required meta tags -->
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<!-- Bootstrap CSS -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<nav class="navbar navbar-expand-lg navbar-dark bg-info" onload="startTime()">
	<a class="navbar-brand" href="/" style="font-weight: bold">Fakturowo</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarText">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item">
				<a class="nav-link" href="/invoice/add">Nowa faktura</a>
			</li>
			<li class="nav-item">
				<a class="nav-link" href="/invoice/list">Faktury</a>
			</li>
			<li class="nav-item">
				<a class="nav-link" href="/customers/list">Klienci</a>
			</li>
			<li class="nav-item">
				<a class="nav-link" href="/register">Rejestracja</a>
			</li>
		</ul>
		<span class="navbar-text">
			<span id="currentTime"></span>
		</span>
	</div>
</nav>
<script>
	function startTime() {
		var today = new Date();
		var h = today.getHours();
		var m = today.getMinutes();
		var s = today.getSeconds();
		var dd = today.getDate();
		var mm = today.getMonth()+1;
		var yyyy = today.getFullYear();

		if(dd<10) {
			dd = '0'+dd
		}

		if(mm<10) {
			mm = '0'+mm
		}

		m = checkTime(m);
		s = checkTime(s);
		document.getElementById('currentTime').innerHTML =
			dd + "." + mm + "." + yyyy + " " + h + ":" + m + ":" + s;
		var t = setTimeout(startTime, 500);
	}

	function checkTime(i) {
		if (i < 10) {
			i = "0" + i
		}
		;  // add zero in front of numbers < 10
		return i;
	}
</script>
<body onload="startTime()" style="background-color: lightblue">


