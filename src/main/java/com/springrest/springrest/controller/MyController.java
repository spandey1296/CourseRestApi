package com.springrest.springrest.controller;


import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import  java.io.*;




@RestController
public class MyController {

    @Autowired
    private CourseService courseService;


    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.courseService.getCourses();

    }

















}
