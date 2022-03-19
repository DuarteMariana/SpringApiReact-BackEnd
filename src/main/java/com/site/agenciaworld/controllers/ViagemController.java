package com.site.agenciaworld.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.site.agenciaworld.entities.Viagem;
import com.site.agenciaworld.repositories.ViagemRepository;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping(value = "/")
public class ViagemController {
	
	@Autowired
	private ViagemRepository viagemRepository;
	
	@GetMapping("/viagens")
	public ResponseEntity<List<Viagem>>findAll() {
		List <Viagem> viagem = viagemRepository.findAll();
		
		return ResponseEntity.ok().body(viagem);
	}
	@GetMapping(value = "/viagens/{id}")
	public ResponseEntity<Viagem> findById(@PathVariable Long id) {
		Viagem viagem = viagemRepository.findById(id).get();
		return ResponseEntity.ok().body(viagem);
	}
	
	//CREATE
		@PostMapping("/viagens")
		public Viagem create (@RequestBody Viagem viagem) {
			return viagemRepository.save(viagem);
		}
		
		
		//UPDATE
		@PutMapping("/viagens/{id}")
		public ResponseEntity<Viagem> update(@PathVariable long id,@RequestBody Viagem viagemDetails) {
			Viagem updateViagem = viagemRepository.findById(id).get();
			
			updateViagem.setDestino(viagemDetails.getDestino());
			updateViagem.setIda(viagemDetails.getIda());
			updateViagem.setVolta(viagemDetails.getVolta());
			
			
			viagemRepository.save(updateViagem);
			
			return ResponseEntity.ok(updateViagem);
		}
		
		//DELETE
		@DeleteMapping("/viagens/{id}")
		public ResponseEntity<HttpStatus> delete(@PathVariable long id) {
			
			Viagem viagem = viagemRepository.findById(id).get();
			
			viagemRepository.delete(viagem);
			
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}

}
