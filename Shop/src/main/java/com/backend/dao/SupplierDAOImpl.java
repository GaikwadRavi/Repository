package com.backend.dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.backend.mode.Supplier;
//import com.backed.mode.Supplier;
@EnableTransactionManagement
@Repository(value="supplierDAO")
public class SupplierDAOImpl implements SupplierDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public SupplierDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
		
	}
	@Transactional
public boolean save(Supplier supplier)
{
	try{
	sessionFactory.getCurrentSession().save(supplier);
	return true;
	}catch (HibernateException e){
		e.printStackTrace();
		return false;
	
	} 
}
	@Transactional
	public boolean update(Supplier supplier)
	{
		try {
			sessionFactory.getCurrentSession().update(supplier);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	@Transactional
	public boolean delete(Supplier supplier)
	{
	
		try {
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	
	}
	
	@Transactional
	public Supplier get(String id)
	{
		String hql = "from Supplier where id = " + " ' "+id +" ' ";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Supplier> list = query.list();
		
		if(list==null || list.isEmpty())
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
	public List<Supplier> list()
	{
		
		String hql = " form Supplier";
		 Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	
	}

	

}
