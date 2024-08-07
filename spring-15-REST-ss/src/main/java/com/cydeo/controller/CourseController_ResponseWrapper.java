package com.cydeo.controller;

import com.cydeo.dto.CourseDTO;
import com.cydeo.dto.ResponseWrapper;
import com.cydeo.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("courses/api/v3")
public class CourseController_ResponseWrapper {

    private final CourseService courseService;


    public CourseController_ResponseWrapper(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public ResponseEntity<ResponseWrapper> getAllCourses(){
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("Version", "Cydeo.V3")
                .body(new ResponseWrapper("courses successfully retrieved", courseService.getCourses()));
    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseWrapper> getCourseById(@PathVariable("id") Long id){

        return ResponseEntity.ok(new ResponseWrapper("courseId: " + id + " retrieved", courseService.getCourseById(id)));

    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteCourseById(@PathVariable Long id){

        courseService.deleteCourseById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Void> updateCourse(@PathVariable Long id, @RequestBody CourseDTO courseDTO){

        courseService.updateCourse(id, courseDTO);
        return ResponseEntity.noContent().build();
    }
}
