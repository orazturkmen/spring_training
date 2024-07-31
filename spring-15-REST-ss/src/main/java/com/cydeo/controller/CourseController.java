package com.cydeo.controller;

import com.cydeo.dto.CourseDTO;
import com.cydeo.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("courses/api/v1")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<CourseDTO> getAllCourse(){
        return courseService.getCourses();
    }

    @GetMapping("{id}")
    public CourseDTO getCourseById(@PathVariable Long id){

        return courseService.getCourseById(id);
    }

    @GetMapping("category/{name}")
    public List<CourseDTO> getCourseByCategory(@PathVariable("name") String category){

        return courseService.getCoursesByCategory(category);
    }

    @PostMapping()
    public CourseDTO createCourse(@RequestBody CourseDTO courseDTO){

        return courseService.createCourse(courseDTO);
    }


    @PutMapping("{id}")
    public void updateCourse(@PathVariable Long id, @RequestBody CourseDTO courseDTO){

        courseService.updateCourse(id,courseDTO);
    }

    @DeleteMapping("{id}")
    public void deleteCourseById(@PathVariable Long id){
        courseService.deleteCourseById(id);
    }

}
