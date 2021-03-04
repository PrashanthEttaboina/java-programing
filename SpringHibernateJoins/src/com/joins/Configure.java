package com.joins;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;


@Configuration
public class Configure {
	@Bean
	public DataSource datasource() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/lotus");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;

	}
	
@Bean
public LocalSessionFactoryBean getLocalSession()
{
	LocalSessionFactoryBean ls=new LocalSessionFactoryBean();
	ls.setDataSource(datasource());
	ls.setAnnotatedClasses(Vendor.class,Customer.class);
	Properties p=new Properties();
	p.setProperty("hibernate.show_sql", "true");
	p.setProperty("hibernate.dialet", "org.hibernate.dialect.MySQL8Dialect");
	p.setProperty("hibernate.hbm2ddl.auto", "update");	
	return ls;
	
}

@Bean
public HibernateTemplate htemplate()
{
	HibernateTemplate ht=new HibernateTemplate();
	ht.setSessionFactory(getLocalSession().getObject());
	ht.setCheckWriteOperations(false);
	return ht;
	
}
@Bean
public LeftJoin ljoin()
{
	
	LeftJoin il=new LeftJoin();
	il.setHtemplate(htemplate());
	return il;				
}

@Bean
public InnerJoin ijoin()
{
	
	InnerJoin il=new InnerJoin();
	il.setHtemplate(htemplate());
	return il;				
}
@Bean
public RightJoin rjoin()
{
	
	RightJoin il=new RightJoin();
	il.setHtemplate(htemplate());
	return il;				
}


}
