$(document).ready(function(){
	$('body').on('click', '.editarReparto', function(){
	    $('#id').val($(this).attr('id'));
	    $('#txtPrecio').val($(this).attr('param1'));
	    $('#txtFecha').val($(this).attr('param2'));
  
	    $('#modalReparto').modal({show: true});
	    return false;
	 });
});