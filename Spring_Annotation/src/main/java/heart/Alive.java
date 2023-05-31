package heart;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Alive implements  Heart{
public void alive() {
	System.out.println("heart is alive");
}
}
