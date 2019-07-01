package main.bdd.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.bdd.Bdd;
import main.model.Dato;

public class BaseDatosModificar {

	private Bdd base;
	
	@Before
	public void setUp() throws Exception {
		this.base = new Bdd();
		this.base.agregar(new Dato("A1", "Datosssss Prueba"));
		this.base.agregar(new Dato("A2", "Datosssss Prueba"));
		this.base.agregar(new Dato("A3", "Datosssss Prueba"));
		this.base.agregar(new Dato("A4", "Datosssss Prueba"));
	}

	@Test
	public void ModificarRetornoTrue() {
		boolean retorno = this.base.modificar(new Dato("A1", "Datosssss Modificados")); 
		assertTrue(retorno);
	}
	
	@Test
	public void ModificarRetornoFalse() {
		boolean retorno = this.base.modificar(new Dato("A9", "Datosssss Modificados")); 
		assertFalse(retorno);
	}

}
