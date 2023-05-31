package restarunt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("foodconfig.xml");
		Hotel hotel = (Hotel) context.getBean("food");
		System.out.println("Food Name:"+hotel.getFoodname());
		System.out.println("Food Quntity:"+hotel.getQuntity());
		System.out.println("Food Price:"+hotel.getPrice());
		System.out.println("Food Rating:"+hotel.getRating());
	}
}
