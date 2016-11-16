package com.acflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author hungrymind
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = { "com.acflux" })
public class AcFluxAppliaction{

	public static void main(String[] args) {
		SpringApplication.run(AcFluxAppliaction.class, args);
	}
}

