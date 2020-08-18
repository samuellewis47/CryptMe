package crypt.dao;

import crypt.model.User;

public interface UserDAO {
	
	public void addUser(User user);
	
	public User getUserByUserName(String username);
	
}
