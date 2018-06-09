package it.esc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"it.esc"})
@EnableAutoConfiguration
public class EscTestApplicationStarter {

	public static void main(final String[] args) {
		SpringApplication.run(EscTestApplicationStarter.class);
	}
	
}
