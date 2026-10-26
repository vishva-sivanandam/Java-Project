package com.project.couresregistrationsystem.service;

import com.project.couresregistrationsystem.Repository.CourseRegisterRepository;
import com.project.couresregistrationsystem.Repository.CourseRepository;
import com.project.couresregistrationsystem.globalException.CourseNotFound;
import com.project.couresregistrationsystem.model.Course;
import com.project.couresregistrationsystem.model.CourseRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired CourseRepository courseRepository;
    @Autowired CourseRegisterRepository courseRegisterRepository ;

    public List<Course> availableCourse() {
        return courseRepository.findAll();
    }

    public List<CourseRegister> enrolledCourse(){
        return courseRegisterRepository.findAll();
    }

    public void courseRegisterForm(String name, String email, String courseName) {
        CourseRegister courseRegister = new CourseRegister(name,email,courseName);
        courseRegisterRepository.save(courseRegister);
    }

    public void searchById(Integer id) {
        if(id == null){
            throw new CourseNotFound("This Course Id "+id+" is Not Found");
        }
        courseRegisterRepository.findById(id);
    }
}
