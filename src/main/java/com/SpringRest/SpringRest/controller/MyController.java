package com.SpringRest.SpringRest.controller;

import java.util.*;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//import com.SpringRest.SpringRest.services.CourceService;
import com.SpringRest.SpringRest.services.CourseService;
import com.SpringRest.SpringRest.entities.Course;
@RestController
public class MyController 
{
	//private CourseService courceService;
	@GetMapping("/home")
	public String home()
	{
		return "This is get";
	}
	
	@PostMapping("/home")
	public String post()
	{
		return "This is post";
	}
	
	/*@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return null;
		
	}*/
}
