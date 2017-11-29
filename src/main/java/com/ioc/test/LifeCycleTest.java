package com.ioc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.lifecycle.beans.Robot;

public class LifeCycleTest {

	public static void main(String[] args) {

		final BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/ioc/config/application-context.xml"));

		Robot robot = beanFactory.getBean(Robot.class);

		robot.show();

		//

		Runtime.getRuntime().addShutdownHook(new Thread() {

			@Override
			public void run() {
				((ConfigurableBeanFactory) beanFactory).destroySingletons();
			}

		});

	}

}
