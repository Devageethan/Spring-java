package constructorinjection2;

public class Dc {
private String name;
private String power;
public Dc(String name, String power) {
	
	this.name = name;
	this.power = power;
}
@Override
public String toString() {
	return "Dc [name=" + name + ", power=" + power + "]";
}



}
