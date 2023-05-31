package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Students {
@Value("deva")
private String name;
@Value("23")
private int age;
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
@Override
public String toString() {
	return "Students [name=" + name + ", age=" + age + "]";
}

}
