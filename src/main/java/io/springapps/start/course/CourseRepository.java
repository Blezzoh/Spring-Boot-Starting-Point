package io.springapps.start.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,String> {

	/**
	 * Spring JPA implements a method that filters the courses
	  depending on the signature that follows "findBy". In this case it will look for the topicId column.
	 * @param Id - name of the course
	 * @return all the courses matching the topicId
	 */
	public List<Course> findByTopicId(String Id);
	
	/**
	 * Spring JPA implements a method that filters the courses
	  depending on the signature that follows "findBy" in this case it will look for the name column.
	 * @param name - name of the course
	 * @return all the courses matching the name
	 */
	public List<Course> findByName(String name);
	
}
