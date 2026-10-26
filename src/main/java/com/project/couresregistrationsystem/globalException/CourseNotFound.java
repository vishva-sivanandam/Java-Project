package com.project.couresregistrationsystem.globalException;

public class CourseNotFound extends RuntimeException {
    public CourseNotFound(String message) {
        super(message);
    }
}
