package br.com.homecare;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomecareApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HomecareApplication.class, args);
	}

	//Operacao de instanciacao. Instancia objetos ao subir o servidor
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}