package com;

public class Demo {
public void hi() {
	System.out.println("hi i am init");
}
public void bye() {
	System.out.println("hi i am destroy");
}


@Override
public String toString() {
	return "obj is created";
	
}
}
