$(document).ready(function(){
	$('body').on('click', '.verFactura', function(){
	    $('#id').val($(this).attr('id'));
	    $('#txtfac_detalle').val($(this).attr('param2'));
	    $('#txtfac_total').val($(this).attr('param3'));
	    $('#txtfac_ruc').val($(this).attr('param4'));
	    $('#txtfac_razon').val($(this).attr('param5'));
	    
	    $('#modalFactura1').modal({show: true});
	    return false;
	 });
});