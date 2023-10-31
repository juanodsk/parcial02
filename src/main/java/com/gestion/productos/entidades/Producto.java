package com.gestion.productos.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 6)
	private String placa;

	@Column(nullable = false)
	private int entradaHora;
	
	@Column(nullable = false)
	private int entradaMin;

	@Column(nullable = true)
	private int salidaHora;
	
	@Column(nullable = true)
	private int salidaMin;

	@Column(nullable = false)
	private String tipoVehiculo;
	
	@Column(nullable = false)
	private String ubicacion;

	public Producto(Long id, String placa, int entradaHora, int entradaMin, int salidaHora, int salidaMin,
			String tipoVehiculo, String ubicacion) {
		super();
		this.id = id;
		this.placa = placa;
		this.entradaHora = entradaHora;
		this.entradaMin = entradaMin;
		this.salidaHora = salidaHora;
		this.salidaMin = salidaMin;
		this.tipoVehiculo = tipoVehiculo;
		this.ubicacion = ubicacion;
	}

	public Producto() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getEntradaHora() {
		return entradaHora;
	}

	public void setEntradaHora(int entradaHora) {
		this.entradaHora = entradaHora;
	}

	public int getEntradaMin() {
		return entradaMin;
	}

	public void setEntradaMin(int entradaMin) {
		this.entradaMin = entradaMin;
	}

	public int getSalidaHora() {
		return salidaHora;
	}

	public void setSalidaHora(int salidaHora) {
		this.salidaHora = salidaHora;
	}

	public int getSalidaMin() {
		return salidaMin;
	}

	public void setSalidaMin(int salidaMin) {
		this.salidaMin = salidaMin;
	}

	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	
	
	
}
