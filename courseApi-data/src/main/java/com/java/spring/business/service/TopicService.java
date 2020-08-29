package com.java.spring.business.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.java.spring.model.Topic;

@Service
public class TopicService {

	public List<com.java.spring.model.Topic> topics = new ArrayList<>(Arrays.asList(new Topic("spring", "Spring Framework", "Spring framwork description"),
			new Topic("java", "Core Java", "Core Java Description"),
			new Topic("java script", "javaScript", "JavaScript Description")));

	public List<Topic> getAllTopics() {
		return topics;

	}
	

	public Topic getTopic(String id) {
		Topic m = topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		System.out.println(m);
		return m;

	}


	public void addTopic(Topic topic) {
		
		System.out.println(topic.getName());
		System.out.println(topic.getId());
		System.out.println(topic.getDescription());
		
		topics.add(topic);
	}


	public void updateTopic(Topic topic, String id) {

		for(int i=0;i<topics.size();i++)
		{
			Topic t = topics.get(i);
			if(t.getId().equals(id))
			{
				topics.set(i, topic);
				return;
			}
			
		}

		
	}


	public void deleteTopic(Topic topic, String id) {
		topics.removeIf(t -> t.getId().equals(id));

	}

}
