package com.Maven.cofiguration;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class MavenDatabaseConfig {

	public final static String Driver_Manager = "com.mysql.jdbc.Driver";
	public final static String Url = "jdbc:mysql://localhost:3306/springdb";
	public final static String UserName = "root";
	public final static String PassWord = "root";

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSourceManager = new DriverManagerDataSource();

		dataSourceManager.setDriverClassName(Driver_Manager);
		dataSourceManager.setUrl(Url);
		dataSourceManager.setUsername(UserName);
		dataSourceManager.setPassword(PassWord);

		return dataSourceManager;
	}

	@Bean
	public Properties properties() {

		Properties prop = new Properties();
		prop.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		prop.put("hibernate.hbm2ddl.auto", "update");
		prop.put("hibernate.show_sql", true);
		prop.put("hibernate.formate_sql", true);

		return prop;
	}

	@Bean
	public SessionFactory sessionFactory(DataSource dataSource) {
		LocalSessionFactoryBuilder sessionFactory=new LocalSessionFactoryBuilder(dataSource);
		
		sessionFactory.addProperties(properties());
		sessionFactory.scanPackages("com.Maven.Dao");
		
		return sessionFactory.buildSessionFactory();
	}

	@Bean
	public HibernateTemplate hiberTemplate(SessionFactory sessionFactory) {
		HibernateTemplate hibernateTemp = new HibernateTemplate();
		return hibernateTemp;
	}

	@Bean
	public HibernateTransactionManager hibernateTranManager(SessionFactory sessionFactory) {
		HibernateTransactionManager hibernatetranManager = new HibernateTransactionManager();
		return hibernatetranManager;
	}
}
