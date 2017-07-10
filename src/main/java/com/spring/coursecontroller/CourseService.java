package com.spring.coursecontroller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.course.dto.Course;

// automatically creates singleton
@Service
public class CourseService {
	
	private List<Course> courselist= new ArrayList<>(Arrays.asList(new Course("computer", "computer science", "this is 4 years course"),
			new Course("history", "history science", "this is 4 years course"),
			new Course("biology", "bio science", "this is 4 years course")));

	public List<Course> getCourseDetails() 
	{
		
		return courselist;
	}

	public void saveCourse(Course course) 
	{
		courselist.add(course);
		System.out.println(courselist.toString());
		
	}

	public void updateCourse(Course course, String id) 
	{
		for(int i=0; i<courselist.size(); i++)
		{
			Course currcourse=courselist.get(i);
			if(currcourse.getId().equalsIgnoreCase(id))
			{
				courselist.set(i, course);
				System.out.println(courselist.toString());
			}
		}
		
	}

	public void deleteCourse(String id) 
	{
		courselist.removeIf(t->t.getId().equals(id));
		
	}
	
	

}
