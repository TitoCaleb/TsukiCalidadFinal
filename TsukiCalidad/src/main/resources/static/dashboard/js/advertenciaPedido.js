function eliminar(id){
        swal({
  			title: "Estás seguro que deseas eliminar?",
			text: "Una vez eliminado no se podra recuperar lo eliminado",
			icon: "warning",
			buttons: true,
			dangerMode: true,
	})
		.then((OK) => {
 			 if (OK) {
				$.ajax({
					url:"delete/"+id,
					success: function(res){
						console.log(res);
					}, 
			});
    	swal("Listo! El pedido fue eliminado con exito", {
      		icon: "success",
   		 }).then((OK)=>{
				if(OK){
					location.href="/pedido/";
				}
			});
  			} else {
    		swal("No se ha eliminado nada");
  }
});
}	