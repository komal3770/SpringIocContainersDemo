package com.concretepage;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BeanFactoryWithXmlResourceOld {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("spring-app.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Entitlement ent = (Entitlement)factory.getBean("entitlement");
        System.out.println(ent.getName());
        System.out.println(ent.getTime());
	}

}
