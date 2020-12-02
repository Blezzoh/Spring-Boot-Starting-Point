package io.springapps.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

	/**
	 * sets up the default configuration depending upon convention(majority use case)
	 * starts Spring application context(container for all of the code running on the server like services, controllers, business logic)
	 * performs class path scan(scans the annotations) 
	 * starts Tomcat server
	 * @param args
	 */
	public static void main(String [] args) {
		SpringApplication.run(CourseApiApp.class, args);
	}
}
