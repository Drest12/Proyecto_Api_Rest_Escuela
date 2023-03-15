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

import evaluacioncontinua3.models.Services.IAulaService;
import evaluacioncontinua3.models.entity.Aula;
@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/apiaula")
public class AulaRestControllers {
	@Autowired
	private IAulaService aulaService;
	
	@GetMapping("/aulas")
	public List<Aula> index(){
		return aulaService.findAll();
	}
	
	//Método para mostrar por Id:
	@GetMapping("/aulas/{id}")
	public Aula show(@PathVariable Long id) {
		return aulaService.findById(id);
	}
	
	//Método para crear:
	@PostMapping("/aulas")
	public Aula create(@RequestBody Aula aula) {
		return aulaService.save(aula);
	}
	
	//Método para actualizar:
	@PutMapping("/aulas/{id}")
	public Aula update(@RequestBody Aula cliente,@PathVariable Long id) {
		Aula aulaActual = aulaService.findById(id);
		
		aulaActual.setId_aula(cliente.getId_aula());
		aulaActual.setAula(cliente.getAula());
		aulaActual.setAforo(cliente.getAforo());
		return aulaService.save(aulaActual);
	}
	
	//Método para eliminar:
	@DeleteMapping("/aulas/{id}")
	public void delete(@PathVariable Long id) {
		aulaService.delete(id);
	}

}
