package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CourseServiceImpl implements  CourseService{


    List<Course> list;
    public CourseServiceImpl(){
        list=new ArrayList<>();

       list.add(new Course(123,"java","this is java program"));
        list.add(new Course(127,"pythoon","this is python program"));



    }





    @Override
    public List<Course> getCourses() {
        return list;

    }




}
