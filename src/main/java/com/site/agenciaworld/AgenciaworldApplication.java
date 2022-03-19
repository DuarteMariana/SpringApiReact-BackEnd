package com.site.agenciaworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.site.agenciaworld.entities.Cliente;
import com.site.agenciaworld.entities.Viagem;
import com.site.agenciaworld.repositories.ClienteRepository;
import com.site.agenciaworld.repositories.ViagemRepository;

@SpringBootApplication
public class AgenciaworldApplication implements CommandLineRunner{
	
	@Autowired
	private ViagemRepository viagemRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	public static void main(String[] args) {
		SpringApplication.run(AgenciaworldApplication.class, args);
	
	}
	

	@Override
	public void run(String... args) throws Exception {
	
		/*Cliente c1 = new Cliente(null, "George", 25, "12365446587", "george.silva@gmail.com");
		Cliente c2 = new Cliente (null, "Bruno", 27, "98765232140", "bruno.santos@hotmail.com");
		
		Viagem v1 = new Viagem(null, "Salvador", "03/04/2022", "04/05/2022");
		Viagem v2 = new Viagem(null, "Ceara", "28/03/2022", "05/04/2022");
		
		
		clienteRepository.save(c1);
		clienteRepository.save(c2);
		
		viagemRepository.save(v1);
		viagemRepository.save(v2);
		*/
	}

}
