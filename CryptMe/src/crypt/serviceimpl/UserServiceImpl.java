package crypt.serviceimpl;

import java.util.Date;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import crypt.dao.UserDAO;
import crypt.form.LoginForm;
import crypt.form.SignupForm;
import crypt.model.User;
import crypt.security.PasswordManager;
import crypt.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDAO userDao;
	
	@Override
	public void addUser(SignupForm signupForm) {

		Date createdOn = new Date();
		PasswordManager passwordManager = new PasswordManager();
		String saltedPassword = passwordManager.passwordAbstracter(signupForm.getPlainPassword(), createdOn);
		
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setAmbiguityIgnored(true);
		User user = modelMapper.map(signupForm, User.class);
		
		user.setPassword(saltedPassword);
		user.setCreatedOn(createdOn);
		userDao.addUser(user);
	}

	@Override
	public boolean authenticateUser(LoginForm loginForm) {
		User user = userDao.getUserByUserName(loginForm.getUserName());
		PasswordManager passwordManager = new PasswordManager();
		String saltedPassword = passwordManager.passwordAbstracter(loginForm.getPlainPassword(), user.getCreatedOn());
		
		return saltedPassword.equals(user.getPassword());
	}

}
