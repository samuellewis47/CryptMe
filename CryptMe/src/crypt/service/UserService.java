package crypt.service;

import crypt.form.LoginForm;
import crypt.form.SignupForm;

public interface UserService {
	
	public void addUser(SignupForm signupForm);
	
	public boolean authenticateUser(LoginForm loginForm);
}
