package com.utn.WebService;

import com.utn.WebService.util.SessionData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebServiceApplication {

	public static String TOCKEN = null;

	public static void main(String[] args) {
		SpringApplication.run(WebServiceApplication.class, args);
	}
}
