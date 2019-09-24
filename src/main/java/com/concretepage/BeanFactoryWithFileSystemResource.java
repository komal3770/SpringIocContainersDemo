package com.concretepage;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class BeanFactoryWithFileSystemResource {
    public static void main(String... args) {
    	//BeanFactory is not AutoClosable so ClassPathXmlApplicationContext is used
    	try(ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("spring-app.xml")) {
        	Entitlement ent = (Entitlement)factory.getBean("entitlement");
            System.out.println(ent.getName());
            System.out.println(ent.getTime());
    	}
    	catch (Exception e) {
    		e.printStackTrace();
		}
    	
    	BeanFactory factory = new ClassPathXmlApplicationContext("spring-app.xml");
    	Entitlement ent = (Entitlement)factory.getBean("entitlement");
        System.out.println(ent.getName());
        System.out.println(ent.getTime());
        
        Resource resource = new ClassPathResource("spring-app.xml");
        /*BeanFactory factory = new XmlBeanFactory(resource);
        Entitlement ent = (Entitlement)factory.getBean("entitlement");
        System.out.println(ent.getName());
        System.out.println(ent.getTime());
        */
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(resource);
		/*
		 * Entitlement ent = (Entitlement)beanFactory.getBean("entitlement");
		 * System.out.println(ent.getName()); System.out.println(ent.getTime());
		 */
    } 
}