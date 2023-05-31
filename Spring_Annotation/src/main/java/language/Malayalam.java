package language;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ma")
public class Malayalam implements Language{

	public void speak() {
		System.out.println("i can speak malayalam");
		
	}

}
