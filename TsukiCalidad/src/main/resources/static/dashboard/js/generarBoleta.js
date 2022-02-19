$(document).ready(function(){
	$('body').on('click', '.generarBoleta', function(){
	    $('#id').val($(this).attr('id'));
	    $('#txtNombre').val($(this).attr('param1'));
	    $('#txtPedido').val($(this).attr('param2'));
	    $('#txtDetalle').val($(this).attr('param3'));
	    $('#Precio').val($(this).attr('param4'));
	    $('#PrecioR').val($(this).attr('param5'));
	    $('#Total').val($(this).attr('param6'));
	    $('#txtReparto').val($(this).attr('param7'));
	    
	    $('#modalBoleta').modal({show: true});
	    return false;
	 });
});