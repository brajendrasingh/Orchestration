package com.bksoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@SpringBootApplication
public class OrchestrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrchestrationApplication.class, args);
	}
	
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public Docket swaggerPlugin() {
		  return new Docket(DocumentationType.SWAGGER_2)          
			      .select()
			      .apis(RequestHandlerSelectors.basePackage("com.bksoft"))
			      .paths(PathSelectors.ant("/*"))
			      .build()
			      .apiInfo(apiInfo());
	 }
	    
	 private ApiInfo apiInfo() {
	        return new ApiInfoBuilder()
	            .title("Orchestration Application")
	            .description("Orchestration Application For Webservices")
	            .contact(new Contact("Brajendra", "www.bksoft.com", "brajendrasingh@gmail.com"))
	            .license("Apna License Version")
	            .licenseUrl("https://LICENSE")
	            .version("2.0")
	            .build();
	    }

}
