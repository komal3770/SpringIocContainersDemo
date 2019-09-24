package com.concretepage;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * BeanFactoryWithXmlResourceNew shows alternative of XmlBeanFactory,
 * DefaultListableBeanFactory & XmlBeanDefinitionReader is introduced
 */
public class BeanFactoryWithXmlResourceNew {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("spring-app.xml");
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(resource);
        MyBean ent = (MyBean)beanFactory.getBean("mybean");
        System.out.println(ent.getName()); 
        System.out.println(ent.getTime());
        
        /*Another alternative*/
        System.out.println("====Using ClassPathXmlApplicationContext for defining bean====");
        BeanFactory factory = new ClassPathXmlApplicationContext("spring-app.xml");
        MyBean ent2 = (MyBean)factory.getBean("mybean");
        System.out.println(ent2.getName());
        System.out.println(ent2.getTime());
	}

}
