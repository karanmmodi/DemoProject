package com.Maven.cofiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@Import({MavenDatabaseConfig.class})
@ComponentScan(basePackages = "com.Maven")
public class MavenConfiguration implements WebMvcConfigurer {

	@Bean
	public InternalResourceViewResolver viewResolver() {

		InternalResourceViewResolver viewRelove = new InternalResourceViewResolver();
		viewRelove.setPrefix("/WEB-INF/view/");
		viewRelove.setSuffix(".jsp");
		return viewRelove;
	}
}
