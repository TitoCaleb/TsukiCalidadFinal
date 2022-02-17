package com.example.demo.models.service;

import com.example.demo.models.entity.Factura;
import java.util.List;

public interface IFacturaService {
	public void guardar(Factura factura);
	public List<Factura> listaFacturas();
	public void delete(Long id);
}
