package com.jwt.JWT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
public class JwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtApplication.class, args);
	}

}
