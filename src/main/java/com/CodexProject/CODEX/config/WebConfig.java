package com.CodexProject.CODEX.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Value("${frontend.url}")
    private String frontendLink;

    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
                .allowedOrigins(frontendLink)
                .allowedMethods("GET","POST","UPDATE","DELETE","OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true);
    }

}
