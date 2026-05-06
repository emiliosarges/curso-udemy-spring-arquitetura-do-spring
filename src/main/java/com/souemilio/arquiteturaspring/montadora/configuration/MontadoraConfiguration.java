package com.souemilio.arquiteturaspring.montadora.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.souemilio.arquiteturaspring.montadora.Motor;
import com.souemilio.arquiteturaspring.montadora.TipoMotor;

@Configuration
public class MontadoraConfiguration {
	
	@Bean("motorAspirado")
	public Motor motorAspirado() { 
		var motor = new Motor();
		motor.setCavalos(120);
		motor.setCilindros(4);
		motor.setModelo("XPTO");
		motor.setLitragem(2.0);
		motor.setTipo(TipoMotor.ASPIRADO);
		return motor;
	}
	
	@Bean("motorEletrico")
	@Primary
	public Motor motorEletrico() { 
		var motor = new Motor();
		motor.setCavalos(110);
		motor.setCilindros(3);
		motor.setModelo("TH-40");
		motor.setLitragem(1.4);
		motor.setTipo(TipoMotor.ELETRICO);
		return motor;
	}
	
	@Bean("motorTurbo")
	public Motor motorTurbo() { 
		var motor = new Motor();
		motor.setCavalos(180);
		motor.setCilindros(4);
		motor.setModelo("XPTO-01");
		motor.setLitragem(1.5);
		motor.setTipo(TipoMotor.TURBO);
		return motor;
	}
	
}
