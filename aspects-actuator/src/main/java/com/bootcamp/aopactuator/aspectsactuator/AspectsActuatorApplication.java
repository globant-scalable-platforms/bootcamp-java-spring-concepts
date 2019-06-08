package com.bootcamp.aopactuator.aspectsactuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
public class AspectsActuatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(AspectsActuatorApplication.class, args);
	}

}
