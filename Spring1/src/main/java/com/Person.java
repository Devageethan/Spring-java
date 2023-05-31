package com;

public class Person {
		@Override
	public String toString() {
		return "Person [name=" + name + ", card=" + card + "]";
	}
		private String name;
		private Pancard card;
		public Person(String name, Pancard card) {
			super();
			this.name = name;
			this.card = card;
		}
		
		
}
