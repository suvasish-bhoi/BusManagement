package com.bus.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bus.hbm.Users;

@Repository
public class UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	public boolean findUser(String user, String fname) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Users.class);
		criteria.add(Restrictions.eq("username", user));
		criteria.add(Restrictions.eq("fname", fname));
		return true;

	}

	public void saveUser(Object user) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
	}
}
