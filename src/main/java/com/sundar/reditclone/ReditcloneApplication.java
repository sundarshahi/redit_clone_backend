package com.sundar.reditclone;

import com.sundar.reditclone.config.SwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@Import(SwaggerConfiguration.class)
public class ReditcloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReditcloneApplication.class,
				args);
	}

}
