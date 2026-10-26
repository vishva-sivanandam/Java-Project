package com.project.couresregistrationsystem.controller;

import com.project.couresregistrationsystem.model.Course;
import com.project.couresregistrationsystem.model.CourseRegister;
import com.project.couresregistrationsystem.service.CourseService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired CourseService courseService;

    @GetMapping("/Id")
    public String getName(HttpServletRequest request){
        return "This is Session Id "+request.getSession().getId();
    }

    @GetMapping("/get/{id}")
    public void getById(@PathVariable("id") int courseId ){
        courseService.searchById(courseId);
    }

    @GetMapping("/course")
    public List<Course> allCourse(){
        return courseService.availableCourse();

    }
    @GetMapping("/course/enrolled")
    public List<CourseRegister> allRegisterCourse(){
        return courseService.enrolledCourse();
    }
    @PostMapping("/course/register")
    public String courseRegister(@RequestParam("name") String name,
                                 @RequestParam("emailId") String email,
                                 @RequestParam("courseName") String courseName){

        courseService.courseRegisterForm(name,email,courseName);
        return "SuccessFully   Added   "+name+" in   Your   Course  "+courseName;
    }

}
