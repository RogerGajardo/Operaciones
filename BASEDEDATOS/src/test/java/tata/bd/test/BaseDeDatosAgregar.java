package tata.bd.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tata.bd.base.BaseDeDatos;
import tata.bd.dato.Dato;

public class BaseDeDatosAgregar {

	private BaseDeDatos base;
	@Before
	public void setUp() throws Exception {
		this.base = new BaseDeDatos();
	}

	@Test
	public void cuandoAgrega1EntoncesTrue() {
		boolean retorno = this.base.agregar(new Dato("A1","DATOSSSSSSS"));
		assertTrue(retorno);
	}
}
