package com.manav.courseapi.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	public TopicRepository topicRepos;
	
	
	public List<Topic> getAllTopics(){
		 List<Topic> topic=new ArrayList<>();
	     topicRepos.findAll().forEach(topic::add);
	     return topic;
	}
		
	public Topic geTopic(String id){
		return topicRepos.findById(id).get();
	}
	
	public void addTopic(Topic topic){
		topicRepos.save(topic);
	}

	public void updateTopic(Topic topic, String id) {
		topicRepos.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepos.deleteById(id);	
	}

			
}
