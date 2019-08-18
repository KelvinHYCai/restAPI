package io.kelvin.api.service;

import io.kelvin.api.model.Topic;
import io.kelvin.api.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopics() {
		return (List<Topic>)topicRepository.findAll();
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

