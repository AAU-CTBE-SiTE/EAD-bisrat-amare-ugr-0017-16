package com.craft.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApp {

    public static void main(String[] args) {

        // Create Spring IoC Container
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AnnotationConfig.class);

        // Get Student Bean
        AnnotationStudent student =
                context.getBean(AnnotationStudent.class);

        // Display Student Details
        student.getDetails();

        // Close Spring Container
        context.close();
    }
}