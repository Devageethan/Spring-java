package friuts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {
			public static void main(String[] args) {
				ApplicationContext context=new ClassPathXmlApplicationContext("friutconfig.xml");
			Friuts	friut=(Friuts) context.getBean("fruit");
			System.out.println(friut);
			}
}
