package com.dilu.domain;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Named("emp")
public class Employee implements InitializingBean,DisposableBean {

	@Value("888")
	private int eid;
	@Value("Dilun")
	private String ename;
	@Value("78000.00")
	private float esalary;
	
	
	
	@PreDestroy
	public void destroy1()  {
		
		System.out.println("unreference all data Anno");
	}
	
	@PostConstruct
	public void afterPropertiesSet1()  {
		
		System.out.println("Initialization complete successfully Anno");
	}

	@Override
	public void destroy() throws Exception {
		
		System.out.println("unreference all data program");	
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Initialization complete successfully program");
		
	}
	
	public void cancel()  {
		
		System.out.println("unreference all data declartive");
		
	}
	public void init()  {
		
		System.out.println("Initialization complete successfully program declartive");		
	}
		
}
