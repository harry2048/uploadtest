package com.zr.uploadtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class UploadtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(UploadtestApplication.class, args);
	}

}
