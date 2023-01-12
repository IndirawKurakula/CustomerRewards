package com.retail;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

public class swagger {
	
	@Configuration	
	@EnableSwagger2
	@ConditionalOnProperty(name="customerRewardsProgram.swagger.enable", havingValue = "true", matchIfMissing = false)

	public class SwaggerConfig {                                    
	    @Bean
	    public Docket api() { 
	        return new Docket(DocumentationType.SWAGGER_2)  
	          .select()                                  
	          .apis(RequestHandlerSelectors.any())              
	          .paths(PathSelectors.any())                         
	          .build().apiInfo(apiInfo());                                          
	    }
	    private ApiInfo apiInfo() {
			return new ApiInfoBuilder()
				.title("customer rewards")
				.description("customer rewards program")
				.version("1.0")
				.build();
		}
	}
}