package com.marketplace.producto.aplicacion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.marketplace.producto.dominio.ProductoService;
import com.marketplace.producto.dominio.ProductoServiceImpl;

@Configuration
public class ConfiguracionDeAplicacion {

	
    @Bean
    public ProductoService productoService() {
        return new ProductoServiceImpl();
    }
}
