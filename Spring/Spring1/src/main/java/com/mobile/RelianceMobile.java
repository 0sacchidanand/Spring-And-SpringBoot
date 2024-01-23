package com.mobile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sim.Sim;

public class RelianceMobile {
	//private IdeaSim r = new IdeaSim();
	ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
	private Sim r= context.getBean(Sim.class);
	
	public RelianceMobile() {
		startMobile();
		//r.startideaSim();
		r.startSim();
	}

	

	private void startMobile() {
		System.out.println("Welcome to reliamce mobile");
		
	}
}

// tightly and loosely couple Example