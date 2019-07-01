package anfp.equipos.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import anfp.equipos.modelo.Equipo;
import anfp.equipos.modelo.dao.IEquipoDAO;

@RunWith(SpringRunner.class)
@DataJpaTest
public class EquiposTest {
	
	@Autowired
	TestEntityManager entityManager;
	
	@Autowired
	IEquipoDAO dao;
	
	@Before
	public void setUp() throws Exception {
		Equipo equipo = new Equipo("Cobreloa", 40, "Calama","Mario" );
		this.entityManager.persist(equipo);
		equipo = new Equipo("COLO COLO", 90, "Santiago","Pedro" );
		this.entityManager.persist(equipo);
		equipo = new Equipo("U de Chile", 10, "Santiago","Juan" );
		this.entityManager.persist(equipo);
	}


	@Test
	public void cuandofindByIdEntoncesCobreloa() {
		Equipo cobreloa = this.dao.findById("Cobreloa").get();
		assertTrue("DEBERIA SER COBRELOA PERO ES "+cobreloa.getNombre(), cobreloa.getNombre().equals("Cobreloa"));
	}
	
	@Test
	public void cuandoFindAllEntonces3() {
		int cuantos = this.dao.findAll().size();
		assertTrue("Son "+cuantos+ " Pero deberia ser 3", cuantos==3);
	}
	
	@Test
	public void cuandofindByIdEntoncesTieneTodosLosDatos() {
		Equipo cobreloa = this.dao.findById("Cobreloa").get();
		Equipo equipo = this.dao.save(new Equipo("Cobreloa", 40, "Calama","Mario" ));
		boolean sonIguales = cobreloa.equals(equipo);
		assertTrue(sonIguales);
	}

}
