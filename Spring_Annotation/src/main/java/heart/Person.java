package heart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
@Autowired
Heart heart;
void heart() {
	heart.alive();
}
}
