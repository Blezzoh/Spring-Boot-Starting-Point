package io.springapps.start.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	
	
	public List<Course> getAllCourses(String id){
		List<Course> list = new ArrayList<>();
		courseRepository.findByTopicId(id).forEach(t-> list.add(t));
		return list;
	}
	
	public Course getCourse(String id) {
		return courseRepository.findById(id).get();
	}
	
	public void updateCourse(Course c) {
		courseRepository.save(c);
	}
	
	public void addCourse(Course c) {
		courseRepository.save(c);
	}
	
	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
}
