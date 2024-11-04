package me._hanho.react_default.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	public void addCorsMappdings(CorsRegistry registry) {
		registry.addMapping("/**")
				.allowedOrigins("*");
	}
}
