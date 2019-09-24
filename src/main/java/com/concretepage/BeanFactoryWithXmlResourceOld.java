package com.concretepage;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * BeanFactoryWithXmlResourceOld Shows the demo of BeanFactory with XmlBeanFactory which is deprecated.
 * For alternate version of XmlBeanFactory please refer BeanFactoryWithXmlResourceNew
 */
@SuppressWarnings("deprecation")
public class BeanFactoryWithXmlResourceOld {
	
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("spring-app.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        MyBean ent = (MyBean)factory.getBean("mybean");
        System.out.println(ent.getName());
        System.out.println(ent.getTime());
	}

}
