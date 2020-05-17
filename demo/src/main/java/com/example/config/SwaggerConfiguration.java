package com.example.config;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

	public Docket swaggerConfig()

	{
		return new Docket(DocumentationType.SWAGGER_2);
		
	}

}
