package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext c=new ClassPathXmlApplicationContext("config.xml");
	Demo d=(Demo)c.getBean("demo");
	System.out.println(d);
}
}
