package com.RestauranteSpring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orden")
public class Orden {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String apellido;
	private String producto;
	private Double ci;
	private Integer cantidad;
	private String tipo_pago;
	private String tipo_orden;
	private Double total;
	
	

	public Orden(Integer id, String nombre, String apellido, String producto, Double ci, Integer cantidad,
			String tipo_pago, String tipo_orden, Double total) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.producto = producto;
		this.ci = ci;
		this.cantidad = cantidad;
		this.tipo_pago = tipo_pago;
		this.tipo_orden = tipo_orden;
		this.total = total;
	}

	public Orden() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public Double getCi() {
		return ci;
	}

	public void setCi(Double ci) {
		this.ci = ci;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getTipo_pago() {
		return tipo_pago;
	}

	public void setTipo_pago(String tipo_pago) {
		this.tipo_pago = tipo_pago;
	}

	public String getTipo_orden() {
		return tipo_orden;
	}

	public void setTipo_orden(String tipo_orden) {
		this.tipo_orden = tipo_orden;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "Orden [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", producto=" + producto + ", ci="
				+ ci + ", cantidad=" + cantidad + ", tipo_pago=" + tipo_pago + ", tipo_orden=" + tipo_orden + ", total="
				+ total + "]";
	}

}
