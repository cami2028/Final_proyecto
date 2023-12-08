/*Desactivar opciones del menú*/
var elemento = document.getElementsByClassName("opMenu");
for(var i=0; i<elemento.length; i++){
    elemento[i].className = "nav-link opMenu";
}

/*Activar opción de categoría*/
var opcion = document.getElementById("mHotel");
opcion.className = "nav-link opMenu activado";

(function(){
    var listaBotonesEditar = document.querySelectorAll(".botonEditar");
    listaBotonesEditar.forEach(item => {
        item.addEventListener("click", e =>{
            document.getElementById('hotel_id').value = item.dataset.hotel_id;
            document.getElementById('txtNombre').value = item.dataset.hotel_nombre;
            document.getElementById('txtCapacidad').value = item.dataset.hotel_capacidad;
            document.getElementById('txtPrecio').value = item.dataset.hotel_precio;
            document.getElementById('txtImagen').src = "";
            document.getElementById('txtImagen').src = item.dataset.hotel_imagen;
            new bootstrap.Modal(document.getElementById('editarModal')).show();
        })
    })
})();