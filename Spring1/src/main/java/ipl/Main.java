package ipl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("ipl.xml");
	IPl i=(IPl)context.getBean("ipl");
	System.out.println(i);
	}
}
