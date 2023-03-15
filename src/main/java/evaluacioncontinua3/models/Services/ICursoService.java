package evaluacioncontinua3.models.Services;

import java.util.List;

import evaluacioncontinua3.models.entity.Curso;



public interface ICursoService {
	public List<Curso> findAll();
	public Curso findById(Long id);
	public Curso save (Curso curso);
	public void delete (Long id);

}
