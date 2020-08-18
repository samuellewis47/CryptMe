package crypt.daoimpl;


import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import crypt.dao.UserDAO;
import crypt.model.User;

@Repository
public class UserDAOImpl implements UserDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void addUser(User user) {
		getCurrentSession().save(user);
	}

	@Override
	public User getUserByUserName(String userName) {
		Query query = getCurrentSession().createQuery("from User u where u.userName = :userName")
				.setParameter("userName", userName);
		return (User) query.getSingleResult();
	}
	
}
