package language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
@Autowired
@Qualifier("ma")
private Language language;
void speak() {
	language.speak();
}
}
