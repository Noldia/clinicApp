<%@include file="../views/include/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>Admin panel</title>
<jsp:include page="include/styles.jsp" />
</head>
<style>
/* Asegura que las secciones ocupen el 100% de la altura disponible */
.full-height {
	height: 90vh;
}
</style>
<body>
	<jsp:include page="./include/menu.jsp" />
	<div class="container-fluid mt-4 me-4">
		<div class="row mx-4">
			<div class="col-md-8 full-height">
				<div class="card h-100">
					<div class="card-body">
						<div class="row">
							<div class="col">
								<h3 class="card-title">Listado</h3>
							</div>
							<div class="col d-flex justify-content-end">
								<button class="btn btn-outline-primary btn-lg" data-bs-toggle="modal" data-bs-target="#myModal">
									<span class="material-symbols-outlined">person_add</span>
								</button>
							</div>
						</div>
						<table class="table" id="data-table">
							<thead>
								<tr>
									<th>ID</th>
									<th>Nombre</th>
									<th>DNI</th>
									<th>Telefono</th>
									<th>Direccion</th>
									<th>Especialidad</th>
									<th>Clinica</th>
								</tr>
							</thead>
							<tbody>
								
							</tbody>
						</table>
					</div>
				</div>
			</div>
			<div class="col-md-4 full-height">
				<div class="card h-100">
					<div class="card-body">
						<h5 class="card-title mb-4">Menu administrador</h5>
						<div class="d-grid gap-2 col-6 mx-auto mt-4">
							<button type="button" id="btn-doctor"
								class="btn btn-outline-secondary btn-lg">
								<span class="material-symbols-outlined">stethoscope</span>
								Doctores
							</button>
							<button type="button" id="btn-receptionist"
								class="btn btn-outline-secondary btn-lg">
								<span class="material-symbols-outlined">support_agent</span>
								Recepcionistas
							</button>
							<button type="button" id="btn-patient"
								class="btn btn-outline-secondary btn-lg">
								<span class="material-symbols-outlined">personal_injury</span>
								Pacientes
							</button>
							<button type="button" id="btn-appointment"
								class="btn btn-outline-secondary btn-lg">
								<span class="material-symbols-outlined">clinical_notes</span>
								Citas
							</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<!-- Mola para agregar -->
	
	<div class="modal fade" id="myModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h1 class="modal-title fs-5" id="exampleModalLabel">Agregar Doctor</h1>
	        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
	      </div>
	      <div class="modal-body">
	        <div class="col">
	        	<div class="mb-3">
				  <label for="nombre" class="form-label">Nombre</label>
				  <input type="text" class="form-control" id="nombre" placeholder="">
				</div>
				<div class="mb-3">
				  <label for="dni" class="form-label">DNI</label>
				  <input type="text" class="form-control" id="dni" placeholder="">
				</div>
				<div class="mb-3">
				  <label for="telefono" class="form-label">Telefono</label>
				  <input type="text" class="form-control" id="telefono" placeholder="">
				</div>
				<div class="mb-3">
				  <label for="direccion" class="form-label">Direccion</label>
				  <input type="text" class="form-control" id="direccion" placeholder="">
				</div>
	        </div>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
	        <button type="button" id="btn-guardar" class="btn btn-success">Guardar</button>
	      </div>
	    </div>
	  </div>
	</div>
	
	<jsp:include page="include/scripts.jsp" />
	<script>
		var myModal = new bootstrap.Modal(document.getElementById("myModal"), {});
	
		document.getElementById("btn-doctor").addEventListener("click", function () {
	        fetch("<%=request.getContextPath()%>/admin/getDoctors")
	        	.then(response => response.json() )
	        	.then(data => {
	                var tbody = document.getElementById("data-table").getElementsByTagName("tbody")[0];
	                tbody.innerHTML = ""; // Limpiar tabla antes de agregar datos
	
	                data.forEach(item => {
	                    var row = "<tr>" +
	                        "<td>" + item.doctorId + "</td>" +
	                        "<td>" + item.doctorName + "</td>" +
	                        "<td>" + item.doctorDNI + "</td>" +
	                        "<td>" + item.doctorPhone + "</td>" +
	                        "<td>" + item.doctorAddress + "</td>" +
	                        "<td>" + item.medicalSpeciality + "</td>" +
	                        "<td>" + item.clinic.clinicName + "</td>" +
	                        "</tr>";
	                    tbody.insertAdjacentHTML("beforeend", row);
	                });
	            })
	            .catch(error => {
	                console.error("Error al obtener los datos:", error);
	            });
	    });
		document.getElementById("btn-guardar").addEventListener("click", function () {
			fetch("<%=request.getContextPath()%>/doctor/save", {
     			credentials: 'include',
    			method: 'POST',
     			headers: {
    				/* 'X-CSRF-TOKEN': token, */
    				'Content-Type': 'application/json'
    				
    			},
    			body: JSON.stringify({
    				'doctorName': document.getElementById("nombre").value,
    				'doctorDNI': document.getElementById("dni").value,
    				'doctorPhone': document.getElementById("telefono").value,
    				'doctorAddress': document.getElementById("direccion").value
    			})
			}).then(() => {
				document.getElementById("nombre").value = '';
				document.getElementById("dni").value = '';
				document.getElementById("telefono").value = '';
				document.getElementById("direccion").valuee = '';
				myModal.hide();
    			swal("Guardado!", "Doctor guardado con exito !", "success")
	    			.then((value) => {
	    				//if (value)
	    					//window.location.reload();
	    			});
    		})
    		.catch( console.log )
		});
	</script>
</body>
</html>