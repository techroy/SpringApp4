package com.ioc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.lookup.beans.Car;



public class LookUpTest {

	public static void main(String[] args) {
		
		final BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/ioc/config/application-context.xml"));

		Car car = (Car)beanFactory.getBean("car1");
		
		System.out.println(car.hashCode());
		
		System.out.println(car.getClass().getName());
		
		car.run();

		
		
	}

}
