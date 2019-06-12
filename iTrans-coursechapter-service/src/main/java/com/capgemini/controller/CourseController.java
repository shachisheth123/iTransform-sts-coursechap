package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entity.CourseEntity;
import com.capgemini.service.CourseService;

@RestController
public class CourseController {

	
	@Autowired
	private CourseService  courseService;
	
	@PostMapping("/course")
	public ResponseEntity<CourseEntity> addNewChapter(@RequestBody CourseEntity Itransform){
		CourseEntity iTransform=courseService.addNewCourse(Itransform);
		return new ResponseEntity<CourseEntity>(iTransform,HttpStatus.CREATED);		
	}
	
	@GetMapping("/course/{{chapter}}")
	public ResponseEntity<CourseEntity> getUserByUserName(@PathVariable String chapterName){
		return new ResponseEntity<CourseEntity>(courseService.getChapterName(chapterName), HttpStatus.OK);
	}
}
