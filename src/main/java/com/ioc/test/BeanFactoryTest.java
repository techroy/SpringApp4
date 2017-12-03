package com.ioc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.nested.beans.DbCOnfig;

public class BeanFactoryTest {

	public static void main(String[] args) {

		// final BeanFactory beanFactory = new XmlBeanFactory(
		// new ClassPathResource("com/ioc/config/application-context.xml"));

		ApplicationContext context = new ClassPathXmlApplicationContext("com/ioc/config/application-context.xml");

		// BeanFactoryPostProcessor beanFactoryPostProcessor =
		// (BeanFactoryPostProcessor) beanFactory.getBean("pphc");

		// beanFactoryPostProcessor.postProcessBeanFactory((ConfigurableListableBeanFactory)
		// beanFactory);context

		// DbCOnfig dbCOnfig = (DbCOnfig) beanFactory.getBean("dbconfig");

		//DbCOnfig dbCOnfig = (DbCOnfig) context.getBean("dbconfig");

		//System.out.println(dbCOnfig);

	}
}
