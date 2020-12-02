### What is this?

A good starting point for writing a spring boot web application

### Package Embedded

1. Spring boot web starter: A preset combination of JARs that works together 
			for the web(check the **maven** dependencies folder after updating the project)

2. Embedded TomCat Server
	- Servlet container configurations is part of the application
	- Can run by a simple command
	- useful for microservices architecture
	- Stand alone application

### Ressources

1. Topics

Its implementation introduces contents of Spring Boot Web in a RestFull API and its components. 

	- GET    /topics       Gets all topics
	- GET    /topics/{id}    Gets the topic
	- POST   /topics       Creates new topic
	- PUT    /topics/{id} 	 Updates the topic
	- DELETE /topics/{id}    Deleltes the topic

2. Courses

Its implemention introduces the relationship two entities in a spring context

	- GET    /topics/{id}/courses              Gets all topics
	- GET    /topics/{id}/courses/{courseId}   Gets the topic
	- POST   /topics/{id}/courses              Creates new topic
	- PUT    /topics/{id}/courses/{courseId}   Updates the topic
	- DELETE /topics/{id}/courses/{courseId}   Deletes the topic
	
### Installation
	
	This is a **maven** project with a pom.xml, it follows the regular way of installing a **maven** project.
	
### Running
 
	
	1. Java Application
		a. update the project with maven
		b. Run CourseApiApp.java as a Java Application
		
	2. Generating a maven JAR file and running it
		a. Run "maven clean install" inside the project
		b. Run "java -jar /target/{jarName}"

		
	

	
