package heart;

import org.springframework.stereotype.Component;

@Component
public class Broken implements Heart{
public void alive() {
	System.out.println("heart is broken");
}
}
