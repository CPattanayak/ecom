package com.ecom.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;



import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;

import springfox.documentation.spi.DocumentationType;

import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
//@Import(BeanValidatorPluginsConfiguration.class)
public class Swagger {
	private static final String title = "order intake API";
	private static final String description = "API for Order data load";
	private static final String version = "v1";
	private static final String termsOfServiceUrl = "urn:tos";
	private static final String license = "Apache 2.0";
	private static final String licenseUrl = "http://www.apache.org/licenses/LICENSE-2.0";
	

	@Bean
	public Docket intakeApi() {
		return new Docket(DocumentationType.SWAGGER_2)

				.select()
				.apis(RequestHandlerSelectors.basePackage("com.ecom"))

				.paths(PathSelectors.regex("/v1/orders*"))
				.build()
				.apiInfo(metaData());
				
				
	}

	private ApiInfo metaData() {
		ApiInfo apiInfo = new ApiInfo(title, description, version, termsOfServiceUrl, ApiInfo.DEFAULT_CONTACT, license, licenseUrl, Collections.emptyList());
		return apiInfo;
	}

   

    
   
}

