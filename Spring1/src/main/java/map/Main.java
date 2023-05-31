package map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
	
	ApplicationContext context=new ClassPathXmlApplicationContext("players.xml");
	Players p=(Players)context.getBean("players");
	System.out.println(p);
	}
}
