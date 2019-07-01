package anfp.equipos.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="equipos")
public class Equipo {
	/*******************ATRIBUTOS*********************/
	@Id
	private String nombre;
	@Column(name="puntos")
	private int puntos;
	@Column(name="ciudad")
	private String ciudad;
	@Column(name="nombre_dt")
	private String nombre_dt;
	/******************* CONTRUCTOR, GETTERS Y SETTERS*********************/
	
	public Equipo() {
		// TODO Auto-generated constructor stub
	}
	
	public Equipo(String nombre, int puntos, String ciudad, String nombre_dt) {
		this.nombre = nombre;
		this.puntos = puntos;
		this.ciudad = ciudad;
		this.nombre_dt = nombre_dt;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getNombre_dt() {
		return nombre_dt;
	}
	public void setNombre_dt(String nombre_dt) {
		this.nombre_dt = nombre_dt;
	}
	

	public boolean equals(Equipo otro) {
		if (this.nombre.equals(otro.nombre)) {
			if (this.puntos == otro.puntos) {
				if (this.ciudad.equals(otro.ciudad)) {
					if (this.nombre_dt.equals(otro.nombre_dt)) {
						return true;
					}
					return false;
				}
				return false;
			}
			return false;
		}
		return false;
	}
}
