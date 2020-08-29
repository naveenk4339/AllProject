package com.java.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.spring.business.service.TopicService;
import com.java.spring.business.service.UserServiceException;
import com.java.spring.model.Topic;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() 
	
	{
		
		return topicService.getAllTopics();
	}

	
	
	@RequestMapping("/topics/{id}")
	@ExceptionHandler()
	public Topic getTopic(@PathVariable String id) 
	{
          System.out.println(id);
          if(id==null) {
        	  throw new UserServiceException("please enter valid id ");
          }
		return topicService.getTopic(id);
	}



	@RequestMapping(method = RequestMethod.PUT , value = "/topics/{id}")
	public void addTopics(@RequestBody Topic topic,@PathVariable String id ) 
	{
         // System.out.println(id);
		 topicService.updateTopic(topic,id);
	}
		
	@RequestMapping(method = RequestMethod.DELETE , value = "/topics/{id}")
	public void deleteTopics(@RequestBody Topic topic,@PathVariable String id ) 
	{
         // System.out.println(id);
		topicService.deleteTopic(topic,id);
	}
}
