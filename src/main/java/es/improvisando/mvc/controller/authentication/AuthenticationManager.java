package es.improvisando.mvc.controller.authentication;

import java.util.Map;

import es.improvisando.mvc.model.authentication.AuthenticationResult;

public class AuthenticationManager implements IAuthenticationManager{

	private Map<String, String> userDB;
	
	@Override
	public AuthenticationResult authenticate(String username, String password) {
		AuthenticationResult result = AuthenticationResult.FAIL_USER_NOT_EXISTS;
		if(userDB.containsKey(username)){
			String storedPassword = userDB.get(username);
			if(storedPassword.equals(password)){
				result = AuthenticationResult.SUCCESS;
			}
			else{
				result = AuthenticationResult.FAIL_WRONG_PASSWORD;
			}
		}
		return result;
	}

	public void setUserDB(Map<String, String> userDB) {
		this.userDB = userDB;
	}
	
	

}
