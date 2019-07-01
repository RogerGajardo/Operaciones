package tata.operaciones.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tata.operaciones.Operaciones;

public class OperacionesTestsSuma {

	private Operaciones opes;
	
	@Before
	public void setUp() throws Exception {
		this.opes = new Operaciones();
	}

	@Test
	public void sumaCuando15mas20entonces35() {
		int resultado = this.opes.sumar(15, 20);
		//es lo mismo ambas opciones
		//assertTrue(resultado == 35);
		assertEquals(35, resultado);
	}
	
	@Test
	public void sumaCuandoA0entonces0() {
		int resultado = this.opes.sumar(20, 0);
		assertEquals(0, resultado);
	}
	
	@Test
	public void restaCuandoBmayorQueAentonces0() {
		int resultado = this.opes.resta(15, 20);
		assertEquals(0, resultado);
	}
	

}
