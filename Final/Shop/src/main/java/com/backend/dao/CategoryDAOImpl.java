package com.backend.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.backend.mode.Category;

@EnableTransactionManagement
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO{
	//private static final Logger log = Log
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public CategoryDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
		
	}
	/*@Transactional
public boolean saveorupdate(Category category)
{
	try{
	//sessionFactory.getCurrentSession().save(category);
	sessionFactory.getCurrentSession().saveOrUpdate(category);
	return true;
	}catch (Exception e){
		e.printStackTrace();
		return false;
	
	} 
}*/
	
	@Transactional
	public boolean saveorupdate(Category category)
	{
		try{
		//sessionFactory.getCurrentSession().save(category);
		sessionFactory.getCurrentSession().saveOrUpdate(category);
			return true;
		}catch (Exception e){
			e.printStackTrace();
			return false;
		} 
	}
	@Transactional
	public boolean update(Category category)
	{
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	@Transactional
	public boolean delete(Category category)
	{
	
		try {
			//log.debug("starting of method delete");
			sessionFactory.getCurrentSession().delete(category);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//log.error("Error occured :" + e.getMessage());
			e.printStackTrace();
			return false;
		}
	
	}
	
	@Transactional
	public Category get(int categoryId)
	{
		//log.debug("starting of method get");
		//log.info("trying to get category on id:"+id);
		String hql = "from Category where categoryId = " + " ' "+categoryId +" ' ";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Category> list = query.list();
		
		if(list==null|| list.isEmpty())
		{
			return null;
		}
		else
		{
			return list.get(0);
		}
		
	}
	
	@Transactional
	 public Category getRowById(int categoryId) {
	  Session session = sessionFactory.openSession();
	  Category category = (Category) session.load(Category.class, categoryId);
	  return category;
	 }
	@Transactional
	 public int updateRow(Category category) {
		  Session session = sessionFactory.openSession();
		  Transaction tx = (Transaction) session.beginTransaction();
		  session.saveOrUpdate(category);
		  try {
			tx.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  Serializable id = session.getIdentifier(category);
		  session.close();
		  return (Integer) id;
		 }
	
	@SuppressWarnings("deprecation")
	@Transactional
	public List<Category> list()
	{
		
		String hql = " from Category";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	
	}

}
