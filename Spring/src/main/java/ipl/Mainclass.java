package ipl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ipl.xml");
		Ipl ipl = (Ipl) context.getBean("ipl");
		System.out.println(ipl);
	}
}
