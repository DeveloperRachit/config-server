package com.configserver.implement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SloConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SloConfigServerApplication.class, args);
	}

}
