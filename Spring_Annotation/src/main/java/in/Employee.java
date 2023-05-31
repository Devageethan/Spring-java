package in;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
@Value("deva")
private String name;
@Value("34000")
private int salary;
@Override
public String toString() {
	return "Employee [name=" + name + ", salary=" + salary + "]";
}


}
