package org.simplilearn.app;

import org.simplilearn.app.components.Controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public abstract class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("AppConfig.class");
		Controller controller=context.getBean("controller", Controller.class );
		controller.controller();

	}

}

