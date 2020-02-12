package com.dilu.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.dilu.confg.AppConfig;
import com.dilu.domain.Employee;


public class TestLifeCycle {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac=null;
		Employee emp1 = null;
		
		
		ac = new AnnotationConfigApplicationContext(AppConfig.class);
		emp1 = ac.getBean("emp",Employee.class);
	
		
		
		
		((AbstractApplicationContext) ac).close();

	}

}
