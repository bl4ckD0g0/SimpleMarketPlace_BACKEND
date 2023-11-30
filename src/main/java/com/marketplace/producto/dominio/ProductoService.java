package com.marketplace.producto.dominio;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface ProductoService {

    Producto obtenerProducto(Long id);

    List<Producto> obtenerTodosLosProductos();

	Producto crearProducto(Producto producto);
	
    Producto actualizarProducto(Long id, Producto producto);

    void eliminarProducto(Long id);
}
