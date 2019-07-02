package anfp.equipos.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

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
public class EquiposTests {

	@Autowired
	TestEntityManager entityManager;
	@Autowired
	IEquipoDAO dao;
	
	@Before
	public void setUp() throws Exception {
		Equipo equipo = new Equipo("Cobreloa", 38, "Calama", "Fantasma Figueroa");
		this.entityManager.persist(equipo);
		equipo = new Equipo("Palestino", 25, "Santiago", "Peineta garcés");
		this.entityManager.persist(equipo);
		equipo = new Equipo("Naval", 41, "Talcahuano", "Patricio Almendra");
		this.entityManager.persist(equipo);
		equipo = new Equipo("Concepción", 25, "Concepción", "Estéban González");
		this.entityManager.persist(equipo);
		equipo = new Equipo("Coquimbo", 25, "Coquimbo", "Patricio Graff");
		this.entityManager.persist(equipo);
	}	
	@Test
	public void cuandoFindAllEntonces5() {
		int cuantos = this.dao.findAll().size();
		assertTrue("SON " + cuantos + " PERO DEBERÍAN SER 5", cuantos == 5);
	}	
	@Test
	public void cuandoFindByIdEntoncesTieneTodosSusDatos() {
		Equipo cobreloa = this.dao.findById("Cobreloa").get();
		Equipo cobreloaOriginal = new Equipo("Cobreloa", 38, "Calama", "Fantasma Figueroa");
		boolean sonIguales = cobreloa.equals(cobreloaOriginal);
		assertTrue(sonIguales);
	}
	@Test
	public void cuandoFindByPuntos25Entonces3Equipos() {
		List<Equipo> lista = this.dao.findByPuntos(25);
		String nombres[] = {"Palestino", "Concepción", "Coquimbo"};
		for(int i=0; i<lista.size(); i++) {
			assertTrue(lista.get(i).getNombre().equals(nombres[i]));
		}		
		assertTrue("SON " + lista.size() + " PERO DEBERIAN SER 3", lista.size() == 3);
	}
	@Test
	public void cuandoElimina1Entonces4Equipos() {
		this.dao.deleteById("Cobreloa");
		int largo = this.dao.findAll().size();
		assertTrue("SON " + largo + " PERO DEBERÍAN SER 4", largo == 4);
	}
	@Test
	public void cuandoInserta1Entonces6Equipos() {
		this.dao.save(new Equipo("Lota", 45, "Lota", "Don loto"));
		int largo = this.dao.findAll().size();
		assertTrue("SON " + largo + " PERO DEBERÍAN SER 6", largo == 6);
	}
	@Test
	public void cuandoModificaNombreDTEntoncesSeObtieneModificado() {
		this.dao.save(new Equipo("Cobreloa", 38, "Calama", "Riveros"));
		Equipo cobreloa = this.dao.findById("Cobreloa").get();
		assertNotNull(cobreloa);
		assertTrue("ES " + cobreloa.getNombre_dt() + " PERO DEBERÍA SER Riveros", cobreloa.getNombre_dt().equals("Riveros"));
	}
	
	
	
	
	
	
	
	
	
	
}
