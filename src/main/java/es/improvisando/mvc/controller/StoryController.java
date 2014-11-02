package es.improvisando.mvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import es.improvisando.mvc.business.stories.StoryManager;
import es.improvisando.mvc.model.story.Story;

@Controller
public class StoryController extends AbstractHeaderController{

	private static final Logger logger = LoggerFactory
			.getLogger(StoryController.class);

	@RequestMapping(value = "/story", params = { "storyid" }, method = RequestMethod.GET)
	public String showStory(Model model,
			@RequestParam("storyid") String storyId) {

		logger.info("Story controller for story: " + storyId);

		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans/Beans.xml");
		StoryManager storyManager = (StoryManager) context.getBean("storyManager"); 
		
		Story story = storyManager.getStory(storyId);
		
		setHeaderModel(model);
		model.addAttribute("story", story);
		logger.info("Story name: " + story.getName());
		return "story";
	}

}
