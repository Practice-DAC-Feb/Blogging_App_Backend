package com.codewithravi.blog.config;

import java.util.Collection;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

	@Bean
	public Docket api() {
		
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(getInfo())
				.select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build();
	}

	private ApiInfo getInfo() {

		
		
		return new ApiInfo("Blogging Application : Backend Course",
				"This project is developed by Ravi",
				"1.0",
				"Terms Of Service",
				new Contact("Ravindra","https//www.youtube.com","ravindrashende7867@gmail.com"),
				"Licence of APIS",
				"API license URL",
				Collections.emptyList()
				);
	};
	
	
	
}