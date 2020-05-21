package com.sundar.reditclone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class ReditcloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReditcloneApplication.class, args);
	}

}
