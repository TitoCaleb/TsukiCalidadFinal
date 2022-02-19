$(document).ready(function(){
	$('body').on('click', '.editarReparto', function(){
	    $('#id').val($(this).attr('id'));
	    $('#txtPrecio').val($(this).attr('param1'));
	    $('#txtFecha').val($(this).attr('param2'));
	    $('#txtNombre').val($(this).attr('param3'));
	    $('#txtPedido').val($(this).attr('param4'));
	   
  
	    $('#modalReparto').modal({show: true});
	    return false;
	 });
});