package org.simplilearn.aap;

import java.time.LocalDate;

import org.simplilearn.aap.config.HibConfig;
import org.simplilearn.aap.dao.EmpDao;
import org.simplilearn.aap.dao.EmpDaolmpl;
import org.simplilearn.aap.entities.Emp;
import org.simplilearn.aap.exception.EmployeeNotFoundException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(HibConfig.class);
		EmpDao dao=context.getBean("empDaoImpl", EmpDaolmpl.class);
		/*Emp e=new Emp();
		e.setName("raman");
		e.setName("chennai");
		e.setDateOfJoin(LocalDate.of(2010, 05, 01));
		dao.insert(e);*/
		
		Emp e=dao.get(1).orElseThrow(()->new EmployeeNotFoundException("Employee not found"));
        System.out.println(e.getEno()+"\t"+e.getName()+"\t"+e.getAddress());;
	}

}
