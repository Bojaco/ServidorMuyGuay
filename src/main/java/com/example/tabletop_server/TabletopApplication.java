package com.example.tabletop_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TabletopApplication {
	public static void main(String[] args) {
		SpringApplication.run(TabletopApplication.class, args);
		System.out.println("Hola");
	}
	/*public void run(String... args) throws Exception {
		Pepejucion pepe = new Pepejucion();
		pepe.ejecucion();
}*/
}
