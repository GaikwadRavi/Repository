package com.backend.dao;

import java.util.List;



//import javax.management.Query;

import org.hibernate.HibernateException;
import org.hibernate.Query;
//import org.hibernate.Query;
//import org.hibernate.Query;
import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
//import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.backend.mode.Product;

@EnableTransactionManagement
@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO{
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public ProductDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
		
	}
	@Transactional
public boolean save(Product product)
{
	try{
	sessionFactory.getCurrentSession().save(product);
	return true;
	}catch (HibernateException e){
		e.printStackTrace();
		return false;
	
	} 
}
	@Transactional
	public boolean update(Product product)
	{
		try {
			sessionFactory.getCurrentSession().update(product);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	@Transactional
	public boolean delete(Product product)
	{
	
		try {
			sessionFactory.getCurrentSession().delete(product);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	
	}
	
	@Transactional
	public Product get(String id)
	{
		String hql = "from Product where id = " + " ' "+id +" ' ";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Product> list = query.list();
		
		if(list==null || list.isEmpty())//make this change in very DaoImpl
		{
			return null;
		}
		else
		{
			return list.get(0);
		}
		
	}
	
	@SuppressWarnings("deprecation")
	@Transactional
	public List<Product> list()
	{
		
		String hql = " form Product";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	
	}

}
