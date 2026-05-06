package com.souemilio.arquiteturaspring.montadora.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.souemilio.arquiteturaspring.montadora.CarroStatus;
import com.souemilio.arquiteturaspring.montadora.Chave;
import com.souemilio.arquiteturaspring.montadora.HondaHRV;
import com.souemilio.arquiteturaspring.montadora.Motor;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {
	
	@Autowired
	@Aspirado
	private Motor motor;
	


	@PostMapping
	public CarroStatus ligarCarro(@RequestBody Chave chave) {
		var carro = new HondaHRV(motor);
		return carro.darIgnicao(chave);
	}
	
	
}
 