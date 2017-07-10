package com.spring.coursecontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.course.dto.Course;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseservice;
	
	@RequestMapping(value="/courses")
	public List<Course> getCourseDetails()
	{
		
		return courseservice.getCourseDetails();
	}
	
	@RequestMapping(value="/courses", method=RequestMethod.POST)
	public void saveCourse(@RequestBody Course course)
	{
		courseservice.saveCourse(course);
	}
	
	@RequestMapping(value="/courses/{id}", method=RequestMethod.PUT)
	public void updateCourse(@RequestBody Course course, @PathVariable(name="id") String id)
	{
		courseservice.updateCourse(course, id);
	}
	
	@RequestMapping(value="/courses/{id}", method=RequestMethod.DELETE)
	public void deleteCourse(@PathVariable(name="id") String id)
	{
		courseservice.deleteCourse(id);
	}
	
	

}
