package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practica1.componente.Componencia_Dependencia;

@SpringBootApplication
public class Practica1Application implements CommandLineRunner {
	
	  Componencia_Dependencia componte_Dependencia;
	  
    public Practica1Application(Componencia_Dependencia componte_Dependencia) {
		
		this.componte_Dependencia=componte_Dependencia;
	}
	
	

	public static void main(String[] args) {
		SpringApplication.run(Practica1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		String nombre=this.componte_Dependencia.leer_teclado();
		this.componte_Dependencia.salida_mensaje(nombre);
		
	}

	

}
