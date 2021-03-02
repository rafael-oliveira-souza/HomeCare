package br.com.homecare;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.homecare.services.EmailService;
import br.com.homecare.services.commons.InterfaceEmailService;

@Controller
@SpringBootApplication(scanBasePackages = { "br.com.homecare" })
public class HomecareApplication implements CommandLineRunner {

    @RequestMapping("/")
    @ResponseBody
    String home() {
      return "Hello World!";
    }
    
	public static void main(String[] args) {
		SpringApplication.run(HomecareApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	@Bean
	public InterfaceEmailService emailService() {
		return new EmailService();
	}

	// Operacao de instanciacao. Instancia objetos ao subir o servidor
	@Override
	public void run(String... args) throws Exception {
	}

}