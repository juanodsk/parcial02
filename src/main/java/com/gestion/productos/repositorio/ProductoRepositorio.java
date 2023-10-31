package com.gestion.productos.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gestion.productos.entidades.Producto;


public interface ProductoRepositorio extends JpaRepository<Producto, Long>{

		@Query ("SELECT p FROM Producto p WHERE " 
				+ " CONCAT(p.id,p.placa,p.tipoVehiculo,p.entradaHora,p.entradaMin,p.salidaHora,p.salidaMin)"
				+ " LIKE %?1%")
		public List<Producto> findAll(String palabraClave);
}
