package main.bdd.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.bdd.Bdd;
import main.model.Dato;

public class BaseDatosAgregar {

	private Bdd base;
	
	@Before
	public void setUp() throws Exception {
		this.base = new Bdd();
	}

	@Test
	public void AgregarRetorno() {
		boolean retorno = this.base.agregar(new Dato("A1", "Datosssss Prueba")); 
		assertTrue(retorno);
	}

}
