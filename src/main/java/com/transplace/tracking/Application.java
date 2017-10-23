package com.transplace.tracking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource("classpath*:/integration.xml")
@ImportResource({"classpath:fourkites.xml", "classpath:macropoint.xml","classpath:tenfour.xml"})

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
