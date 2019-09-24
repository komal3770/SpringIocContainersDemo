package com.concretepage;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class BeanFactoryWithApplicationContext {
    public static void main(String... args) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring-app.xml");
    	BeanFactory factory = (BeanFactory) context;
    	Entitlement ent = (Entitlement)factory.getBean("entitlement");
        System.out.println(ent.getName());
    } 
}