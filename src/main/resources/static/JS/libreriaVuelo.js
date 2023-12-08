/*Desactivar opciones del menú*/
var elemento = document.getElementsByClassName("opMenu");
for(var i=0; i<elemento.length; i++){
    elemento[i].className = "nav-link opMenu";
}

/*Activar opción de categoría*/
var opcion = document.getElementById("mVuelo");
opcion.className = "nav-link opMenu activado";

(function(){
    var listaBotonesEditar = document.querySelectorAll(".botonEditar");
    listaBotonesEditar.forEach(item => {
        item.addEventListener("click", e =>{
            document.getElementById('vuelo_id').value = item.dataset.vuelo_id;
            document.getElementById('txtDestino').value = item.dataset.vuelo_destino;
            document.getElementById('txtOrigen').value = item.dataset.vuelo_origen;
            document.getElementById('txtPrecio').value = item.dataset.vuelo_precio;
            document.getElementById('txtImagen').src = "";
            document.getElementById('txtImagen').src = item.dataset.vuelo_imagen;
            document.getElementById('txtAerolinea').value = item.dataset.vuelo_aerolinea;
            new bootstrap.Modal(document.getElementById('editarModal')).show();
        })
    })
})();