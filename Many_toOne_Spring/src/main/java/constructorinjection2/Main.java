package constructorinjection2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("dc.xml");
		Dc dc = (Dc) context.getBean("dc");
		System.out.println(dc);
	}
}
