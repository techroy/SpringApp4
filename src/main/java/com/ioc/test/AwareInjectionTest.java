package com.ioc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.lifecycle.beans.Car;
import com.lifecycle.beans.Robot;

public class AwareInjectionTest {

	public static void main(String[] args) {
		
		final BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/ioc/config/application-context.xml"));

		Car car = (Car)beanFactory.getBean("car");
		
		System.out.println(car.hashCode());
		
		
		
		car.run();

		
		
	}

}
