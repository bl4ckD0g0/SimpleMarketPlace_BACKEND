package com.marketplace.producto.infraestructura;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.marketplace.producto.dominio.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{
}
