package org.simplilearn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Address address()
	{
		Address address =new Address();
		address.setDno(101);
		address.setStreetName("gandhi street");
		address.setLoc("chennai");
		return address;
		
	}
	@Bean
	public Emp emp()
	{
		Emp e=new Emp();
		e.setEno(1);
		e.setName("asad");
		e.setAddress(address());
		return e;
		
	}

}
