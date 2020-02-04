package odonto.sp.jandira.br.odonto.resource;

import java.util.List;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import odonto.sp.jandira.br.odonto.model.Dentista;
import odonto.sp.jandira.br.odonto.repository.DentistaRepository;

@RestController
@RequestMapping("/odonto")
public class DentistaResource {

	@Autowired
	private DentistaRepository dentistaRepository;
	
	@GetMapping("/dentistas")
	public List<Dentista> getDentistas() {
		
		return dentistaRepository.findAll();
		
	}
	
	@GetMapping("/dentistas/{codigo}")
	public Dentista getDentista(@PathVariable Long codigo) {
		
		return dentistaRepository.findById(codigo).get();
		
	}
	
	@PostMapping("/dentistas")
	public void gravar(@RequestBody Dentista dentista) {
		
		dentistaRepository.save(dentista);
		
	}
	
}
