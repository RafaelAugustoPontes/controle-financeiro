package com.example.controle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.controle.domain.ServiceExecutor;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class ControleApplication {

	private final ServiceExecutor serviceExecutor;

	public ControleApplication(ServiceExecutor serviceExecutor) {
		this.serviceExecutor = serviceExecutor;
	}

	@PostConstruct
	public void init() {
		serviceExecutor.init();
		serviceExecutor.report();
	}

	public static void main(String[] args) {
		SpringApplication.run(ControleApplication.class, args);
	}

}
