package es.improvisando.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

	private static final Logger logger = LoggerFactory
			.getLogger(IndexController.class);

	/**
	 * Controller called when login data is provided (after login page)
	 *
	 * @param email
	 * @param password
	 * @return
	 */
	@RequestMapping(value = "/index", params = {"email", "password"})
	public String indexAfterLogin(Model model, @RequestParam("email") String email, @RequestParam("password") String password) {
	
//		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans/Beans.xml");
//		IndexPojo obj = (IndexPojo) context.getBean("indexpojo"); 
		
//		model.addAttribute("message", obj.getMessage());
		
		logger.info("User: " + email + " , Password: " + password);
		model.addAttribute("section", "index");
		
		
		return "index";
	}
	
	/**
	 *  Controller being called when index is accessed 
	 * @return
	 */
	@RequestMapping(value = "/index")
	public String indexLogged(Model model) {
	
//		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans/Beans.xml");
//		IndexPojo obj = (IndexPojo) context.getBean("indexpojo"); 
		
//		model.addAttribute("message", obj.getMessage());
		
		logger.info("Index has been reached without login data");
		model.addAttribute("section", "index");	
		return "index";
	}
}
