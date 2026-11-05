package com.craft.annotation;

public class AnnotationSubject {

    private String subjectName;

    public AnnotationSubject(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    @Override
    public String toString() {
        return subjectName;
    }
}