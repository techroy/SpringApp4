package com.ioc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nested.beans.LoanApprover;

public class NestedTest {

	public static void main(String[] args) {

		BeanFactory parentBeanFactory = new XmlBeanFactory(
				new ClassPathResource("com/ioc/config/application-context-parent.xml"));

		BeanFactory childBeanFactory = new XmlBeanFactory(
				new ClassPathResource("com/ioc/config/application-context-child.xml"), parentBeanFactory);

		LoanApprover loanApprover = childBeanFactory.getBean("loanapprover",LoanApprover.class);
		
		loanApprover.approve(2000, 10, 2);
		
	}

}
