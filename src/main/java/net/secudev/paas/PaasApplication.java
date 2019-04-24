package net.secudev.paas;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PaasApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(PaasApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(PaasApplication.class);
	}
	
	   @GetMapping("/hello")
	    public Collection<String> sayHello() {
	        return IntStream.range(0, 10)
	          .mapToObj(i -> "Hello number " + i)
	          .collect(Collectors.toList());
	    }

}
