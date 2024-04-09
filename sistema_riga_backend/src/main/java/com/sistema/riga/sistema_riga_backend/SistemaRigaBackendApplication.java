package com.sistema.riga.sistema_riga_backend;

import com.sistema.riga.sistema_riga_backend.models.DistritoModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaRigaBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaRigaBackendApplication.class, args);

		DistritoModel distritoModel = new DistritoModel();

	}
}