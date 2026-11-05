package com.craft.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.craft.annotation")
public class AnnotationConfig {

    @Bean
    public AnnotationSubject javaSubject() {
        return new AnnotationSubject("Java Programming");
    }

    @Bean
    public AnnotationSubject databaseSubject() {
        return new AnnotationSubject("Database Systems");
    }

    @Bean
    public AnnotationSubject mathematicsSubject() {
        return new AnnotationSubject("Mathematics");
    }
}