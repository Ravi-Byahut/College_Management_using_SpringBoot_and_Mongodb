package com.example.CollegeManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
@EnableSwagger2
public class CollegeManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollegeManagementApplication.class, args);
	}

}
