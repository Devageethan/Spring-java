package referance_type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {
		public static void main(String[] args) {
			ApplicationContext context=new ClassPathXmlApplicationContext("aadhar.xml");
			Person p	=	(Person) context.getBean("refer");
			System.out.println(p.getName());
			System.out.println(p.getA().getCardnum());
		}
}
