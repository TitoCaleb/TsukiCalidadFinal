$(document).ready(function(){
	$('body').on('click', '.verBoleta', function(){
	    $('#id').val($(this).attr('id'));
	    $('#txtNombre1').val($(this).attr('param1'));
	    $('#txtDetalle1').val($(this).attr('param2'));
	    $('#Total1').val($(this).attr('param3'));
	    $('#modalBoleta1').modal({show: true});
	    return false;
	 });
});