package com.project.couresregistrationsystem.Repository;

import com.project.couresregistrationsystem.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {
}
