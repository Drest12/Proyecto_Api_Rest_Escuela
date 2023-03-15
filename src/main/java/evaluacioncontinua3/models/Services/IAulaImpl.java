package evaluacioncontinua3.models.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import evaluacioncontinua3.models.Dao.IAulaDao;
import evaluacioncontinua3.models.entity.Aula;
@Service
public class IAulaImpl implements IAulaService {
	@Autowired
	private IAulaDao aulaDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Aula> findAll() {
		return (List<Aula>) aulaDao.findAll();
	}
	
	@Override
	@Transactional
	public Aula findById(Long id) {
		return aulaDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public Aula save(Aula aula) {
		return aulaDao.save(aula);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		aulaDao.deleteById(id);
	}	

}
