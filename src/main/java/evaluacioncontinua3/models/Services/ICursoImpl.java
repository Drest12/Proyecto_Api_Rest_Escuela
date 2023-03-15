package evaluacioncontinua3.models.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import evaluacioncontinua3.models.Dao.ICursoDao;
import evaluacioncontinua3.models.entity.Alumno;
import evaluacioncontinua3.models.entity.Curso;
@Service

public class ICursoImpl implements ICursoService {
	@Autowired
	private ICursoDao cursoDao;
	@Override
	@Transactional(readOnly=true)
	public List<Curso> findAll() {
		// TODO Auto-generated method stub
		return (List<Curso>)cursoDao.findAll();
	}

	@Override
	@Transactional
	public Curso findById(Long id) {
		// TODO Auto-generated method stub
		return cursoDao.findById(id).orElse(null);
	}

	@Override
	public Curso save(Curso curso) {
		// TODO Auto-generated method stub
		return cursoDao.save(curso);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		cursoDao.deleteById(id);
	}

}
