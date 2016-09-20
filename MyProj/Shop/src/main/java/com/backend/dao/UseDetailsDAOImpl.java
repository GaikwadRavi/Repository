package com.backend.dao;

import java.util.List;


//import javax.management.Query;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.backend.mode.UserDetails;


@Repository(value="userdetailsDAO")
public class UseDetailsDAOImpl implements UserDetailsDAO{
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public UseDetailsDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
		
	}
	@Transactional
public boolean save(UserDetails userdetails)
{
	try{
	sessionFactory.getCurrentSession().saveOrUpdate(userdetails);
	return true;
	}catch (HibernateException e){
		e.printStackTrace();
		return false;
	
	} 
}
	@Transactional
	public boolean update(UserDetails userdetails)
	{
		try {
			sessionFactory.getCurrentSession().update(userdetails);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	@Transactional
	public boolean delete(UserDetails userdetails)
	{
	
		try {
			sessionFactory.getCurrentSession().delete(userdetails);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	
	}
	
	@Transactional
	public UserDetails get(String id)
	{
		String hql = "from UserDetails where id = " + " ' "+id +" ' ";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<UserDetails> list = query.list();
		
		if(list==null || list.isEmpty())
		{
			return null;
		}
		else
		{
			return list.get(0);
		}
		
	}
	
	@Transactional
	 public UserDetails getRowById(String id) {
	  Session session = sessionFactory.openSession();
	  UserDetails userdetails = (UserDetails) session.load(UserDetails.class, id);
	  return userdetails;
	 }
	
	@SuppressWarnings("deprecation")
	@Transactional
	public List<UserDetails> list()
	{
		
		String hql = " from UserDetails";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	
	}

}
