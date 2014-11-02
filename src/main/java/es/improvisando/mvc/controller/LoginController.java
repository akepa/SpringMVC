package es.improvisando.mvc.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import es.improvisando.mvc.controller.authentication.AuthenticationManager;
import es.improvisando.mvc.controller.authentication.IAuthenticationManager;
import es.improvisando.mvc.model.authentication.AuthenticationResult;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController extends AbstractHeaderController {

	private static final Logger logger = LoggerFactory
			.getLogger(LoginController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		if (logger.isInfoEnabled()) {
			logger.info("LoginController has been reached.");
		}

		return "login";
	}

	@RequestMapping(value = "/", params = { "email", "password" }, method = RequestMethod.POST)
	public String indexAfterLogin(Model model,
			@RequestParam("email") String email,
			@RequestParam("password") String password) {


		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans/Beans.xml");
		AuthenticationManager authenticationManager = (AuthenticationManager) context.getBean("authenticationManager"); 
		
		AuthenticationResult authenticationResult = authenticationManager
				.authenticate(email, password);

		logger.info("User: " + email + " , Password: " + password);

		if (AuthenticationResult.SUCCESS.equals(authenticationResult)) {
			return "redirect:/index";
		} else {
			model.addAttribute("authenticationResult", authenticationResult);
			return "login";
		}
	}

}
