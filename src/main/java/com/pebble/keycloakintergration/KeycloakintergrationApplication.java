package com.pebble.keycloakintergration;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@RestController
public class KeycloakintergrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeycloakintergrationApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@GetMapping(path = "/")
	public String index() {
		return "external";
	}

	@GetMapping(path = "/customers")
	public String customers() {
		// addCustomers();
		// model.addAttribute("customers", customerDAO.findAll());
		// model.addAttribute("username", principal.getName());
		return "customers";
	}

}
