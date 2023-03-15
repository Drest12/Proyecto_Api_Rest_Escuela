package evaluacioncontinua3.models.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import evaluacioncontinua3.models.Services.ICursoService;import evaluacioncontinua3.models.entity.Alumno;
import evaluacioncontinua3.models.entity.Curso;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/apicurso")
public class CursoRestControllers {
	@Autowired
	private ICursoService cursoService;

	@GetMapping("/cursos")
	public List<Curso> index() {
		return cursoService.findAll();

	}
	// mostrar id
	@GetMapping("/cursos/{id}")
	public Curso show(@PathVariable Long id) {
		return cursoService.findById(id);
	}

	// crear id
	@PostMapping("/cursos")
	public Curso create(@RequestBody Curso curso) {
		return cursoService.save(curso);
	}
	//actualizar
	@PutMapping("/cursos/{id}")
	public Curso update(@RequestBody Curso curso ,@PathVariable Long id) {
		Curso cursoActual=cursoService.findById(id);
		cursoActual.setCurso(curso.getCurso());
		cursoActual.setCredito(curso.getCredito());

		
		return cursoService.save(cursoActual);
	}
	
	

}
