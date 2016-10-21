package com.backend.donfig;

import java.util.Properties;


import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//import com.backend.dao.ProductDAO;


//import com.backend.dao.ProductDAOImpl;
import com.backend.mode.Category;
import com.backend.mode.Product;
import com.backend.mode.Supplier;
import com.backend.mode.UserDetails;


@Configuration
@ComponentScan("com")
@EnableTransactionManagement

public class ApplicationContextConfig {
	@Bean(name = "dataSource")
	public DataSource getDataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/MyShopDB2");
		dataSource.setUsername("sa");
		dataSource.setPassword("sa");
		
		System.out.println("I am in geDataSource() function");
		
		return dataSource;
		
	}
	
	
	private Properties getHibernateProperties()
	{
		Properties properties = new Properties();
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		properties.put("hibernate.hbm2ddl.auto", "update");
		
		System.out.println("I am in geHibernatePor() function");
		return properties;
		
	}
	@Autowired
	@Bean(name="sessionfactory")
	public SessionFactory getSessionFactory(DataSource dataSource)
	{
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
		sessionBuilder.addProperties(getHibernateProperties());
		sessionBuilder.addAnnotatedClass(Category.class);
		sessionBuilder.addAnnotatedClass(Supplier.class);
		sessionBuilder.addAnnotatedClass(Product.class);
		sessionBuilder.addAnnotatedClass(UserDetails.class);
		
		System.out.println("I am in getSessionFactory() function");
		return sessionBuilder.buildSessionFactory();
	}
	@Autowired
	@Bean(name="transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		System.out.println("I am in getTrasactopnManager() function");
		return transactionManager; 
		
	}
	/*@Autowired
	    @Bean(name = "productDAO")
	    public ProductDAO geCategorDao(SessionFactory sessionFactory) {
	    	return new ProductDAOImpl(sessionFactory);
	    }*/


}
