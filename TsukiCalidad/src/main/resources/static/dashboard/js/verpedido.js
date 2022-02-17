$(document).ready(function(){
	$('body').on('click', '.verPedido', function(){
	    $('#id').val($(this).attr('id'));
	    $('#txtNombre').val($(this).attr('param1'));
	    $('#txtFecha').val($(this).attr('param7'));
	    $('#txtDireccion_entrega').val($(this).attr('param3'));
	    $('#txtForma_pago').val($(this).attr('param4'));
	    $('#txtPrecio').val($(this).attr('param5'));
	    $('#txtDetalle').val($(this).attr('param6'));
	     
	    $('#cboCliente1 option:selected').removeAttr('selected');
	    $('#cboCliente1 option[value='+$(this).attr('param2')+']').attr("selected", true);
	    
	    
	    $('#modalverPedido').modal({show: true});
	    return false;
	 });
});