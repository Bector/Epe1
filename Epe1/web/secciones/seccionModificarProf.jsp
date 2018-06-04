<section id="Profesor" align="center">
		<img src="imagenes/LOGO.png" >
		<section id="contenedor">
                    <form action="ControladorModProf" method="post">
                            <h3>Modificar datos de Profesor</h3><br>  
                                <div class="form-group">
				   <label for="exampleInputEmail1">Dato que desea modificar:</label>
                                   <input type="text" class="form-control" placeholder="Ingrese dato" name="dato">
				</div>
				<div class="form-group">
				   <label for="exampleInputEmail1">Dato antiguo:</label>
                                   <input type="text" class="form-control" placeholder="Ingrese dato antiguo" name="da">
				</div>
                                <div class="form-group">
				   <label for="exampleInputEmail1">Dato nuevo:</label>
                                   <input type="text" class="form-control" placeholder="Ingrese dato nuevo" name="dn">
				</div>
  				<button type="submit" class="btn btn-warning">Modificar</button>
			</form>
		</section>
	</section>