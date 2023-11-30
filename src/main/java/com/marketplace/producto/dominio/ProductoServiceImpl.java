package com.marketplace.producto.dominio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.marketplace.producto.infraestructura.ProductoRepository;

public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository productoRepository;
	
	
	@Override
	public Producto obtenerProducto(Long id) {
		Optional<Producto> productoOptional = productoRepository.findById(id);
		return productoOptional.orElse(null);
	}

	@Override
	public List<Producto> obtenerTodosLosProductos() {
		return productoRepository.findAll();
	}

	@Override
	public Producto crearProducto(Producto producto) {
		return productoRepository.save(producto);
	}
	
	@Override
    public Producto actualizarProducto(Long id, Producto producto) {
        if (productoRepository.existsById(id)) {
        	producto.setId(id);
            return productoRepository.save(producto);
        }
        return null;
    }

    @Override
    public void eliminarProducto(Long id) {
    	productoRepository.deleteById(id);
    }
}
