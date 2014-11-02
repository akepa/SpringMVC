package es.improvisando.mvc.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.Model;

import es.improvisando.mvc.business.stories.StoryManager;

public class AbstractHeaderController {
	
	public void setHeaderModel(Model model){
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans/Beans.xml");
		StoryManager storyManager = (StoryManager) context.getBean("storyManager"); 
		
		model.addAttribute("userStories", storyManager.getUserStories("story1"));
	}
}
