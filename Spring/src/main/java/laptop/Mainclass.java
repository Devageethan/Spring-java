package laptop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {
		public static void main(String[] args) {
			ApplicationContext context=new ClassPathXmlApplicationContext("laptop.xml");
		Laptop	laptop=(Laptop) context.getBean("laptop");
//		System.out.println("Laptop name:"+laptop.getName());
//		System.out.println("price:"+laptop.getPrice());
//		System.out.println("color:"+laptop.getColor());
//		System.out.println("Storage:"+laptop.getStorage());
		System.out.println(laptop);
		}
}
