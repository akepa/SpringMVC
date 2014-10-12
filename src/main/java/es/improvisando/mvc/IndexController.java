package es.improvisando.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

	private static final Logger logger = LoggerFactory
			.getLogger(IndexController.class);

	@RequestMapping(value = "/index", params = {"email", "password"})
	public String indexAfterLogin(@RequestParam("email") String email, @RequestParam("password") String password) {
	
//		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans/Beans.xml");
//		IndexPojo obj = (IndexPojo) context.getBean("indexpojo"); 
		
//		model.addAttribute("message", obj.getMessage());
		
		logger.info("User: " + email + " , Password: " + password);
		
		return "index";
	}
	
	@RequestMapping(value = "/index")
	public String indexLogged() {
	
//		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans/Beans.xml");
//		IndexPojo obj = (IndexPojo) context.getBean("indexpojo"); 
		
//		model.addAttribute("message", obj.getMessage());
		
		logger.info("Index has been reached without login data");
		
		return "index";
	}
}
