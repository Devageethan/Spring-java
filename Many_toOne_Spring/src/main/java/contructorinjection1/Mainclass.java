package contructorinjection1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("lcu.xml");
	 Lcu l= (Lcu) context.getBean("lcu");
	 System.out.println(l);
}
}
