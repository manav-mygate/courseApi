package com.manav.courseapi.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	public CourseRepository courseRepos;
	
	
	public List<Course> getAllCourses(String id){
		 List<Course> topic=new ArrayList<>();
		 courseRepos.findByTopicId(id).forEach(topic::add);
	     return topic;
	}
		
	public Course getCourse(String id){
		return courseRepos.findById(id).get();
	}
	
	public void addCourse(Course topic){
		courseRepos.save(topic);
	}

	public void updateCourse(Course topic, String id) {
		courseRepos.save(topic);
	}

	public void deleteCourse(String id) {
		courseRepos.deleteById(id);	
	}

			
}
