package com.backend.dao;

import java.util.List;


//import org.hibernate.Criteria;
//import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import com.backend.mode.Product;

@EnableTransactionManagement
@Repository(value="productDAO")
public class ProductDAOImpl implements ProductDAO{
	
	
	@Autowired
	private SessionFactory sessionFactory;
	private String id;
	 public ProductDAOImpl()
	{
		
	}
	public ProductDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
		
	}
	@Transactional
public boolean saveorupdate(Product product)
{
	try{
	sessionFactory.getCurrentSession().saveOrUpdate(product);
	return true;
	}catch (Exception e){
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
		} catch (Exception e) {
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
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	
	}
	/*
	    @Transactional
	    public List<Product> list() {
	        @SuppressWarnings("unchecked")
	        List<Product> list = (List<Product>) sessionFactory.getCurrentSession()
	                .createCriteria(Product.class)
	                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	 
	        return list;
	    }*/
	 
	
	@Transactional
	public Product get(String id)
	{
		String hql = "from Product where id = " + " ' "+id +" ' ";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
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
	
	@Transactional
	 public Product getRowById(String id) {
	  Session session = sessionFactory.openSession();
	  Product product = (Product) session.load(Product.class, id);
	  return product;
	 }
	
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	@Transactional
	public List<Product> list()
	{
		
		String hql = " from Product";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	
	}

}
