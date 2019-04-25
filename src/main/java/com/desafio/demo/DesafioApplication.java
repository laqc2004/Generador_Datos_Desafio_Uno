package com.desafio.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desafio.motor.Desafio;

@SpringBootApplication
public class DesafioApplication {

	public static void main(String[] args) {
		Desafio desarrollo= new Desafio();
		desarrollo.desarrollo();
		
	//	SpringApplication.run(DesafioApplication.class, args);
	}

}
