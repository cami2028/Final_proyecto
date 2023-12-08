/*Desactivar opciones del menú*/
var elemento = document.getElementsByClassName("opMenu");
for(var i=0; i<elemento.length; i++){
    elemento[i].className = "nav-link opMenu";
}

/*Activar opción de categoría*/
var opcion = document.getElementById("mUsuarios");
opcion.className = "nav-link opMenu activado";

(function(){
    var listaBotonesEditar = document.querySelectorAll(".botonEditar");
    listaBotonesEditar.forEach(item => {
        item.addEventListener("click", e =>{
            document.getElementById('id').value = item.dataset.id;
            document.getElementById('txtUsername').value = item.dataset.username;
            document.getElementById('txtPassword').value = item.dataset.password;
            document.getElementById('txtEnabled').value = item.dataset.enabled;
            new bootstrap.Modal(document.getElementById('editarModal')).show();
        })
    })
})();