package com.craft.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnnotationStudent {

    private int id = 101;
    private String name = "Bisrat";

    // Object Dependency Injection
    @Autowired
    private AnnotationAddress address;

    // List of Beans Injection
    @Autowired
    private List<AnnotationSubject> subjects;

    public void getDetails() {

        System.out.println("========== STUDENT DETAILS ==========");

        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);

        System.out.println("\n========== ADDRESS ==========");

        System.out.println(address);

        System.out.println("\n========== SUBJECTS ==========");

        for (AnnotationSubject subject : subjects) {
            System.out.println(subject.getSubjectName());
        }
    }
}