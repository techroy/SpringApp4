package com.lookup.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.Aware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public abstract class Car {

	
	public void run() {

		Engine engine = getEngine();
		
		Engine engine1 = getEngine();

		System.out.println("----running----");

		System.out.println(engine.hashCode());

		System.out.println(engine1.hashCode());

		engine.start();

	}

	public abstract Engine getEngine();
}
