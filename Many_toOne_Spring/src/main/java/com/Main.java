package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
		public static void main(String[] args) {
			ApplicationContext context=new ClassPathXmlApplicationContext("configg.xml");
				Teacher teacher= (Teacher)context.getBean("teacher");
				System.out.println(teacher);
		}
}
