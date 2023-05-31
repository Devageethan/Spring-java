package one_tomany;

public class Students {
private String names;

@Override
public String toString() {
	return "Students [names=" + names + "]";
}

public Students(String names) {
	super();
	this.names = names;
}
}
