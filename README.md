# Spring-Boot-Rest-With-Swagger2
Creating a Spring Boot Application With Swqagger

```
  Step 1 : Go to start.spring.io
```

```
  Step 2 :  Fill in the following Details
		Project : Maven Project
		Spring Boot : 2.3.1
		Group : com.pikacoder.spring.swagger
		Artifact : spring-rest-swagger
		Name : spring-rest-swagger
		Description : Spring Boot Project With Swagger Implementations
  		Package Name : com.pikacoder.spring.swagger
		Packaging : jar
 		Java : 8
		Dependencies : 
			Spring Web
			Spring Boot DevTools

```

```
  Step 3 : Generate the project.
```

```
  Step 4 : Import the Project in the IntelliJ and run the project.
```

```
Step 5 : Add the following two dependencies of the Swagger to the Pom.xml.
		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger2</artifactId>
			<version>2.4.0</version>
		</dependency>


		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger-ui</artifactId>
			<version>2.4.0</version>
		</dependency>

```

```
  Step 6 : Create a RestController for testing the Swagger.
package com.pikacoder.spring.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String getHello(){
		return "Sahil Diwan";
	}
}
```

```
  Step 7 :  Create a Config file called SwaggerConfig for this.
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
		  return new Docket(DocumentationType.SWAGGER_2)  
		          .select()                                  
		          .apis(RequestHandlerSelectors.any())              
		          .paths(PathSelectors.any())                          
		          .build();
	}

	private ApiInfo apiInfo() {
return new ApiInfoBuilder().title("Hello Service")
.description("Sample Documentation Generateed Using SWAGGER2 for our Hello World API").build();
	}
}

```
