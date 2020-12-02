package io.springapps.start.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.springapps.start.topic.Topic;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable String id){
		return courseService.getAllCourses(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value = "/topics/{id}/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return courseService.getCourse(courseId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics/{id}/courses")
	public void postCourse(@RequestBody Course c, @PathVariable String id) {
		c.setTopic(new Topic(id, "", ""));
		courseService.addCourse(c);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}/courses/{courseId}")
	public void updateCourse(@PathVariable String courseId, @PathVariable String id, @RequestBody Course c) {
		c.setTopic(new Topic(id, "", ""));
		courseService.updateCourse(c);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}/courses/{courseId}")
	public void deleteCourse(@PathVariable String courseId) {
		courseService.deleteCourse(courseId);
	}
	
	
}
