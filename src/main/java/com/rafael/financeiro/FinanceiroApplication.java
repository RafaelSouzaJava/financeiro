package com.rafael.financeiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.rafael.financeiro.config.property.FinanceiroApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(FinanceiroApiProperty.class)
public class FinanceiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinanceiroApplication.class, args);
	}

}
