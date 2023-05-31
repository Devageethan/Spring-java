package bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {
@Autowired
@Qualifier("c")
private Account account;
@Autowired
@Qualifier("s")
private Account account1;
void deposit() {
	account.deposit();
}
void withdraw() {
	account.withdraw();
}
}
