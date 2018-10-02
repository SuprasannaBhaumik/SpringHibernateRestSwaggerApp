package com.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//EnableSwagger2 : enables swagger support in this class
@Configuration
@EnableSwagger2
public class SwaggerConfig extends WebMvcConfigurationSupport {
	
	@Bean
	public Docket iplApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.study.controller"))
				.paths(myApiPaths())
				.build()
				.apiInfo(metaData());
	}
	
	private Predicate<String> myApiPaths() {
	    return PathSelectors.regex("/ipl/.*");
	}
	
	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("swagger-ui.html")
				.addResourceLocations("classpath:/META-INF/resources/");
		registry.addResourceHandler("/webjars/**")
				.addResourceLocations("classpath:/META-INF/resources/webjars/");
	}
	
	private ApiInfo metaData() {
		return new ApiInfoBuilder()
				.title("Indian Premier League API")
				.description("API to get all the latest information and news from IPL 2019")
				.version("1.0.0")
				.license("IPL Copyright 2019")
				.licenseUrl("http://www.iplt20.com")
				.contact(new Contact("Suprasanna", "http://www.iplt20.com", "suprasanna.bhaumik86@gmail.com"))
				.build();
	}

}
