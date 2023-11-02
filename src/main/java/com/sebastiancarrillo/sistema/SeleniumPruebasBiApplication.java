package com.sebastiancarrillo.sistema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sebastiancarrillo.sistema.selenium.PruebasSelenium;

@SpringBootApplication
public class SeleniumPruebasBiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeleniumPruebasBiApplication.class, args);
		
		 PruebasSelenium selenium = new PruebasSelenium();
		 
		 selenium.pruebaSelenium();
	}

}
