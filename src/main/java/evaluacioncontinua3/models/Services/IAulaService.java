package evaluacioncontinua3.models.Services;

import java.util.List;

import evaluacioncontinua3.models.entity.Aula;


public interface IAulaService {
	public List<Aula> findAll();
	public Aula findById(Long id);
	public Aula save (Aula aula);
	public void delete (Long id);
}
