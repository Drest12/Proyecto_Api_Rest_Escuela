package evaluacioncontinua3.models.Services;

import java.util.List;



import evaluacioncontinua3.models.entity.Alumno;



public interface IAlumnoService {
	public List<Alumno> findAll();
	public Alumno findById(Long id);
	public Alumno save (Alumno alumno);
	public void delete (Long id);

}
