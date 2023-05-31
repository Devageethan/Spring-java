package setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("mobileconfig.xml");
			Mobile mobile=(Mobile) context.getBean("m");
			System.out.println(mobile.getCompany());
			System.out.println(mobile.getModel());
			System.out.println(mobile.getPrice());
}
}
