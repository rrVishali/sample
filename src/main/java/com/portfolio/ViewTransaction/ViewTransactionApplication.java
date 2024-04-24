package com.portfolio.ViewTransaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.portfolio.ViewTransaction")
public class ViewTransactionApplication {

	public ViewTransactionApplication() {
		super();
		//TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		SpringApplication.run(ViewTransactionApplication.class, args);
	}

}
