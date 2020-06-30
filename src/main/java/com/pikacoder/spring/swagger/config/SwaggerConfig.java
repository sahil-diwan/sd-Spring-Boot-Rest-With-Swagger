package com.pikacoder.spring.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket postsApi() {
//		return new Docket(DocumentationType.SWAGGER_2).groupName("Java Techie").apiInfo(apiInfo()).select()
//				.paths(regex("/hello.*")).build();
		
		  return new Docket(DocumentationType.SWAGGER_2)  
		          .select()                                  
		          .apis(RequestHandlerSelectors.any())              
		          .paths(PathSelectors.any())                          
		          .build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Book Service")
				.description("Sample Documentation Generateed Using SWAGGER2 for our Hello World API")
				.build();
	}
}
