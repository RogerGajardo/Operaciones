package tata.bd.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tata.bd.base.BaseDeDatos;
import tata.bd.dato.Dato;

public class BaseDeDatosEliminar {
	private BaseDeDatos base;
	@Before
	public void setUp() throws Exception {
		this.base = new BaseDeDatos();
		this.base.agregar(new Dato("A1","DATA DE A1"));
		this.base.agregar(new Dato("A2","DATA DE A2"));
		this.base.agregar(new Dato("A3","DATA DE A3"));
		this.base.agregar(new Dato("A4","DATA DE A4"));
		this.base.agregar(new Dato("A5","DATA DE A5"));
	}

	@Test
	public void cuandoElimina1Entonces4() {
		this.base.eliminar("A3");
		int largo = this.base.listar().size();
		assertTrue("ES " + largo + " PERO DEBERIA SER 4",largo == 4);
	}
	@Test
	public void cuandoElimina1EntoncesTrue() {
		boolean respuesta = this.base.eliminar("A3");
		assertTrue(respuesta);
	}
	@Test
	public void cuandoNoEliminaEntoncesFalse() {
		boolean respuesta = this.base.eliminar("A6");
		assertFalse(respuesta);
	}
}
