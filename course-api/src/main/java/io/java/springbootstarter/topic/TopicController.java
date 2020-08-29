package io.java.springbootstarter.topic;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.java.springbootstarter.exceptions.UserServiceException;
import io.java.springbootstarter.topic.business.TopicService;
import io.java.springbootstarter.topic.model.Topic;

@RestController
@RequestMapping("/Maintopics")
@Validated
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() 
	
	{
		
		return topicService.getAllTopics();
	}

	
	
	@RequestMapping("/topics/{id}")
	@ExceptionHandler(value= {RuntimeException.class})
	public Topic getTopic(@PathVariable String id) throws UserServiceException 
	{
		System.out.println(id);
		if (id.equals("Naveen")) {

			throw new UserServiceException("please enter valid data");
			
		}
		else
		return topicService.getTopic(id);
	}



	@RequestMapping(method = RequestMethod.POST , value = "/topics/{id}")
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
