package tata.bd.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tata.bd.base.BaseDeDatos;
import tata.bd.dato.Dato;

public class BaseDeDatosModificar {
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
	public void cuandoModificaEntoncesTrue() {
		boolean resultado = this.base.modificar(new Dato("A3", "OTRA COSA DIFERENTE DE LA QUE HABÍA"));
		assertTrue(resultado);
	}
	@Test
	public void cuandoNoModificaEntoncesFalse() {
		boolean resultado = this.base.modificar(new Dato("A6", "OTRA COSA DIFERENTE DE LA QUE HABÍA"));
		assertFalse(resultado);
	}
}
