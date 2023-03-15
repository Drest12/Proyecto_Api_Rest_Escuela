package evaluacioncontinua3.models.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import evaluacioncontinua3.models.Services.IAlumnoService;
import evaluacioncontinua3.models.entity.Alumno;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/apialumno")
public class AlumnoRestControllers {
	@Autowired
	private IAlumnoService alumnoService;

	@GetMapping("/alumnos")
	public List<Alumno> index() {
		return alumnoService.findAll();

	}

	// mostrar id
	@GetMapping("/alumnos/{id}")
	public Alumno show(@PathVariable Long id) {
		return alumnoService.findById(id);
	}

	// crear id
	@PostMapping("/alumnos")
	public Alumno create(@RequestBody Alumno alumno) {
		return alumnoService.save(alumno);
	}

	
	//actualizar
		@PutMapping("/alumnos/{id}")
		public Alumno update(@RequestBody Alumno alumno ,@PathVariable Long id) {
			Alumno alumnoActual=alumnoService.findById(id);
			alumnoActual.setNombre(alumno.getNombre());
			alumnoActual.setApellido(alumno.getApellido());
			alumnoActual.setEmail(alumno.getEmail());
			alumnoActual.setTelefono(alumno.getTelefono());
			
			return alumnoService.save(alumnoActual);
		}
		@DeleteMapping("/alumnos/{id}")
		public void delete (@PathVariable Long id)
		{
			alumnoService.delete(id);
		}
}
