package main.bdd.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.bdd.Bdd;
import main.model.Dato;

public class BaseDatosEliminar {

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
	public void cuandoEliminaEntonces3() {
		this.base.eliminar("A1");
		int largo = this.base.listar().size();
		assertTrue("Es" + largo + " PERO DEBERIA SER 0", largo == 3);
	}
	
	@Test
	public void EliminarRetornoTrue() {
		boolean retorno = this.base.eliminar("A1"); 
		assertTrue(retorno);
	}
	@Test
	public void EliminarRetorno() {
		boolean retorno = this.base.eliminar("A1"); 
		assertFalse(retorno);
	}
}
