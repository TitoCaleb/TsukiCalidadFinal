$(document).ready(function(){
	$('body').on('click', '.editarPedido', function(){
	    $('#id').val($(this).attr('id'));
	    $('#Nombre').val($(this).attr('param1'));
	    $('#Fecha').val($(this).attr('param7'));
	    $('#Direccion_entrega').val($(this).attr('param3'));
	    $('#Forma_pago').val($(this).attr('param4'));
	    $('#Precio').val($(this).attr('param5'));
	    $('#Detalle').val($(this).attr('param6'));
	     
	    $('#cboCliente option:selected').removeAttr('selected');
	    $('#cboCliente option[value='+$(this).attr('param2')+']').attr("selected", true);
	    
	    
	    $('#modalPedido').modal({show: true});
	    return false;
	 });
});