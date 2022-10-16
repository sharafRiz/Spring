package org.simplilearn.beans;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext1.xml");
		Quiz quiz=context.getBean("quiz", Quiz.class);
		System.out.println("The question is");
		System.out.println(quiz.getQuestion());
		System.out.println("the answers are");
		Map<String, User> answers=quiz.getAnswers();
		Set<Entry<String, User>> entries=answers.entrySet();
		for(Map.Entry<String , User> entry:entries)
		{
			System.out.println("the answers is");
			System.out.println(entry.getKey());
			User user=entry.getValue();
			System.out.println("the answer given by "+user.getUserName());
		}

	}

}
