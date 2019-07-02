package amazon.usuarios.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import amazon.usuarios.modelo.DireccionEnvio;
import amazon.usuarios.modelo.UsuarioAmazon;
import amazon.usuarios.modelo.dao.UsuarioAmazonDAO;
@RunWith(SpringRunner.class)
@DataJpaTest
public class AmazonTest {
	
	@Autowired
	TestEntityManager manager;
	@Autowired
	UsuarioAmazonDAO dao;
	
	
	@Before
	public void setUp() throws Exception {
		ArrayList<DireccionEnvio> lista = new ArrayList<DireccionEnvio>();
		lista.add(new DireccionEnvio("pepito", "san jose 2526", "Chile"));
		lista.add(new DireccionEnvio("pepito", "el rosal 25, cartagena", "Chile"));
		lista.add(new DireccionEnvio("pepito", "Av. chillan8954, temuco", "Chile"));
		UsuarioAmazon user = new UsuarioAmazon("pepito", "misterjose123", lista);
		this.manager.persist(user);
	}
	
	@Test
	public void test() {
		System.out.println(this.dao.findById("pepito").get());
		assertTrue(true);
	}


}
