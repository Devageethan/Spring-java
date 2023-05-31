package one_tomany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
		public static void main(String[] args) {
			ApplicationContext context=new ClassPathXmlApplicationContext("list.xml");
			Teacher t=(Teacher)context.getBean("teacher");
			System.out.println(t);
		}
}
