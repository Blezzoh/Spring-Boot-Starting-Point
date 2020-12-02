package io.springapps.start.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Stereotype annotation that marks the class as a service
@Service
public class TopicService { // when the application starts a service runs as a singleton
	
	@Autowired
	private TopicRepository topicRepository;


	public List<Topic> getAllTopics() {
		
		List<Topic> t = new ArrayList<>();
		topicRepository.findAll().forEach(t::add);
		return t; 
	}

	public Topic getTopic(String id) {
		return topicRepository.findById(id).get();
	}
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}
}
