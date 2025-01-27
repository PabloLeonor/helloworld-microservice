package com.microservico.pablo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@SpringBootApplication
public class PabloApplication {
	@GetMapping("/weatherForecast")
	public String getMessage() {
		return "Hace hoy un día estupendo :)";
	}

	public static void main(String[] args) {
		SpringApplication.run(PabloApplication.class, args);
	}

}
