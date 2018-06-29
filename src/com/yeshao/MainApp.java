package com.yeshao;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloSpring helloSpring1 = (HelloSpring) context.getBean("helloSpring");
//        helloSpring1.setMessage("helloSpring1");
//        helloSpring1.getMessage();
//        HelloSpring helloSpring2 = (HelloSpring) context.getBean("helloSpring");
//        helloSpring2.setMessage("helloSpring2");
//        helloSpring2.getMessage();

//        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
//        HelloSpring helloSpringfactory = (HelloSpring) factory.getBean("helloSpring");
//        helloSpringfactory.getMessage();
        Child child = (Child) context.getBean("child");
        child.getMsgParent1();
    }
}
