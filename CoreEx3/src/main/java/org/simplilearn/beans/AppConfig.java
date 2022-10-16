package org.simplilearn.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
 public Emp emp()
 {
	 Emp e=new Emp();
	 e.setEno(1);
	 e.setName("suresh");
	 e.setAddress("chennai");
	 return e;
 }
}
