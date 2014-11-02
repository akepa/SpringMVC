package es.improvisando.mvc.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AboutController extends AbstractHeaderController{

	private static final Logger logger = LoggerFactory
			.getLogger(AboutController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		if (logger.isInfoEnabled()) {
			logger.info("LoginController has been reached.");
		}

		
		setHeaderModel(model);
		// Fill UI model
		model.addAttribute("section", "about");


		return "about";
	}

}
