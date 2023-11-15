package com.prodemy.gen16.akademik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.prodemy.gen16.akademik")
public class AkademikApplication {

	public static void main(String[] args) {
		SpringApplication.run(AkademikApplication.class, args);
	}

}
