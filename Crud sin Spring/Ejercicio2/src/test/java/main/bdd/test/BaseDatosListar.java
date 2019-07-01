package main.bdd.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.bdd.Bdd;
import main.model.Dato;

public class BaseDatosListar {

	private Bdd base;
	
	@Before
	public void setUp() throws Exception {
		this.base = new Bdd();
	}

	@Test
	public void cuandoNoAgregaListaSize0() {
		int largo = this.base.listar().size();
		assertTrue("Es" + largo + " PERO DEBERIA SER 0", largo == 0);
	}

	@Test
	public void cuandoAgrega1ListaSize1() {
		this.base.agregar(new Dato("A2", "Datosssss Prueba"));
		int largo = this.base.listar().size();
		assertTrue("Es" + largo + " PERO DEBERIA SER 1", largo == 1);
	}
	
	@Test
	public void cuandoAgrega3ListaSize5() {
		this.base.agregar(new Dato("A1", "Datosssss Prueba A1"));
		this.base.agregar(new Dato("A2", "Datosssss Prueba A2"));
		this.base.agregar(new Dato("A3", "Datosssss Prueba A3"));
		this.base.agregar(new Dato("A4", "Datosssss Prueba A4"));
		this.base.agregar(new Dato("A5", "Datosssss Prueba A5"));
		int largo = this.base.listar().size();
		assertTrue("Es" + largo + " PERO DEBERIA SER 1", largo == 5);
	}
}
