package heart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import autowired.Config;

public class Main  {
public static void main(String[] args) {
	ApplicationContext c=new AnnotationConfigApplicationContext(heart.Config.class);
	Person p=c.getBean(Person.class,"person");
	p.heart();
}
}
