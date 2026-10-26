package com.project.couresregistrationsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class CourseRegister {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String emailId;
    private String courseName;

    public CourseRegister( String name, String emailId, String courseName) {
        this.name = name;
        this.emailId = emailId;
        this.courseName = courseName;
    }
}
