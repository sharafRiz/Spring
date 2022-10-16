package org.simplilearn.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "org.simplilearn.app") 
public class AppConfig
{
	@Bean
	public DriverManagerDataSource dataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc://localhost:3306/testdb1");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
	@Bean
  public JdbcTemplate jdbcTemplate()
  {
		JdbcTemplate template=new JdbcTemplate();
		template.setDataSource(dataSource());
		return template;
  }
  
}
