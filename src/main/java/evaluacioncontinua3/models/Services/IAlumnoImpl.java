package evaluacioncontinua3.models.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import evaluacioncontinua3.models.Dao.IAlumnoDao;
import evaluacioncontinua3.models.entity.Alumno;
@Service
public class IAlumnoImpl implements IAlumnoService {

	@Autowired
	private IAlumnoDao alumnoDao;
	@Override
	@Transactional(readOnly=true)
	public List<Alumno> findAll() {
		// TODO Auto-generated method stub
		return(List<Alumno>) alumnoDao.findAll();
	}

	@Override
	@Transactional
	public Alumno findById(Long id) {
		// TODO Auto-generated method stub
		return alumnoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Alumno save(Alumno alumno) {
		// TODO Auto-generated method stub
		return alumnoDao.save(alumno);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		alumnoDao.deleteById(id);
	}

}
