package com.concretepage;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * BeanFactoryWithXmlResourceNew shows alternative of XmlBeanFactory,
 * DefaultListableBeanFactory & XmlBeanDefinitionReader is introduced
 */
public class BeanFactoryWithXmlResourceNew {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("spring-app.xml");
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(resource);
        Entitlement ent = (Entitlement)beanFactory.getBean("entitlement");
        System.out.println(ent.getName()); 
        System.out.println(ent.getTime());
	}

}
