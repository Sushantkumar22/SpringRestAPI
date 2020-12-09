package com.SpringRest.SpringRest.services;

import java.util.ArrayList;
import java.util.List;

import com.SpringRest.SpringRest.entities.Course;

public class CourseServiceimpl implements CourseService 
{
	List<Course> list;
	public CourseServiceimpl() 
	{
		list = new ArrayList<>();
		list.add(new Course(145,"Java","Basic Java"));
		list.add(new Course(4343,"Spring","Basic Spring"));
		
	}
	
	@Override
	public List<Course> getCourses() {
		
		return list;
	}

}
