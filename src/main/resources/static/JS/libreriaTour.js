/*Desactivar opciones del menú*/
var elemento = document.getElementsByClassName("opMenu");
for(var i=0; i<elemento.length; i++){
    elemento[i].className = "nav-link opMenu";
}

/*Activar opción de categoría*/
var opcion = document.getElementById("mTour");
opcion.className = "nav-link opMenu activado";

(function(){
    var listaBotonesEditar = document.querySelectorAll(".botonEditar");
    listaBotonesEditar.forEach(item => {
        item.addEventListener("click", e =>{
            document.getElementById('tour_id').value = item.dataset.tour_id;
            document.getElementById('txtNombre').value = item.dataset.tour_nombre;
            document.getElementById('txtDescripcion').value = item.dataset.tour_descripcion;
            document.getElementById('txtDestino').value = item.dataset.tour_destino;
            document.getElementById('txtPrecio').value = item.dataset.tour_precio;
            document.getElementById('txtImagen').src = "";
            document.getElementById('txtImagen').src = item.dataset.tour_imagen;
            new bootstrap.Modal(document.getElementById('editarModal')).show();
        })
    })
})();