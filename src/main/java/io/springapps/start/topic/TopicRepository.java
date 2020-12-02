package io.springapps.start.topic;

// interface that is implemented with all the CRUD methods
import org.springframework.data.repository.CrudRepository;


public interface TopicRepository extends CrudRepository<Topic, String>{

}
