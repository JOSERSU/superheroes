package com.upiiz.superheroes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // Permite solicitudes a todas las rutas de la API
                .allowedOrigins("http://localhost:4200", "https://e17-web-josersus-projects.vercel.app")  // Permite solicitudes desde localhost y Vercel
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Métodos permitidos
                .allowedHeaders("*")  // Acepta cualquier tipo de encabezado
                .allowCredentials(true);
    }
}
