package language;

import org.springframework.stereotype.Component;

@Component
public class Tamil implements Language{
public  void speak() {
	System.out.println("i can speak tamil");
}
}
