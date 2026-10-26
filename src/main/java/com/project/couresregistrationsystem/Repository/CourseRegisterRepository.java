package com.project.couresregistrationsystem.Repository;

import com.project.couresregistrationsystem.model.CourseRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegisterRepository extends JpaRepository<CourseRegister,Integer> {
}
