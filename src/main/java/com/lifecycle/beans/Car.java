package com.lifecycle.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.Aware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Car implements BeanFactoryAware {

	private String beanId;

	private BeanFactory beanFactory;

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
		
	}

	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	public void run() {

		Engine engine = null;

		engine = (Engine) beanFactory.getBean(beanId);

		Engine engine1 = (Engine) beanFactory.getBean(beanId);

		System.out.println("----running----");

		System.out.println(engine.hashCode());

		System.out.println(engine1.hashCode());

		engine.start();

	}
}
