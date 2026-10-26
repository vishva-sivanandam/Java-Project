package com.project.couresregistrationsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Course {

    @Id private int studentId;
    private int courseId;
    private String courseName;
    private String courseTrainer;
    private int courseDuration;
}
