package bank;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("c")
public class Current implements Account {
public void deposit() {
	System.out.println("cas was deposited in current account");
}
public void withdraw() {
	System.out.println("cas was withdraw in current account ");
}
}
