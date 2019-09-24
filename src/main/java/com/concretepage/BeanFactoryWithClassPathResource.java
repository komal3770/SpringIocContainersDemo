package com.concretepage;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class BeanFactoryWithClassPathResource {
    public static void main(String... args) {
    	Resource res = new ClassPathResource("spring-app.xml");
        BeanFactory factory = new XmlBeanFactory(res);
    	Entitlement ent = (Entitlement)factory.getBean("entitlement");
        System.out.println(ent.getName());
    } 
}