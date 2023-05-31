package employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {
		public static void main(String[] args) {
			ApplicationContext context=new ClassPathXmlApplicationContext("map.xml");
			Employee	emp=(Employee) context.getBean("emp");
			System.out.println(emp);
		}
}
