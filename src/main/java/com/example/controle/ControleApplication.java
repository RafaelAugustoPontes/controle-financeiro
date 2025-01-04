package com.example.controle;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.controle.domain.ServiceExecutor;

import lombok.extern.slf4j.Slf4j;


@SpringBootApplication
@Slf4j
public class ControleApplication implements ApplicationRunner {

	private final ServiceExecutor serviceExecutor;

	public ControleApplication(ServiceExecutor serviceExecutor) {
		this.serviceExecutor = serviceExecutor;
	}

	public static void main(String[] args) {
		SpringApplication.run(ControleApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		serviceExecutor.init();
		serviceExecutor.report();
	}

}
