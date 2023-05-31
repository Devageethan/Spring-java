package avengers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("avengers.xml");
		Avengers a = (Avengers) context.getBean("avengers");
		System.out.println(a);
	}
}
