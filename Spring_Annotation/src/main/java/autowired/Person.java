package autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
@Value("Reiner")
private String name;



@Autowired
private Heart heart;

void heart() {
	heart.alive();
}


}
