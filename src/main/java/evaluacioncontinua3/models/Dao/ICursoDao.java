package evaluacioncontinua3.models.Dao;

import org.springframework.data.repository.CrudRepository;

import evaluacioncontinua3.models.entity.Curso;



public interface ICursoDao extends CrudRepository <Curso, Long> {

}
