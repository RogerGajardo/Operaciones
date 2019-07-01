package anfp.equipos.modelo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import anfp.equipos.modelo.Equipo;

@Repository
public interface IEquipoDAO extends JpaRepository<Equipo, String>{

}
