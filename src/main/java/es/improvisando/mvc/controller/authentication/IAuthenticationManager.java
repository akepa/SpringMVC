package es.improvisando.mvc.controller.authentication;

import es.improvisando.mvc.model.authentication.AuthenticationResult;

public interface IAuthenticationManager {

	AuthenticationResult authenticate(String username, String password);
	
}
