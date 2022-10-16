package org.simplilearn.beans;
import org.simplilearn.beans.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.Xml");
		ApplicationContext context=new AnnotationConfigApplicationContext("AppConfig.class");
		Emp e=context.getBean("emp", Emp.class);
		System.out.println(e.getEno()+"\t"+e.getName()+"/t"+e.getAddress());
		((AbstractApplicationContext)context).close();

	}

}
