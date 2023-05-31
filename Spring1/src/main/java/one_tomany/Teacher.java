package one_tomany;

import java.util.List;

public class Teacher {
		private String name;
		private List<Students> names;
		@Override
		public String toString() {
			return "Teacher [name=" + name + ", names=" + names + "]";
		}
		public Teacher(String name, List<Students> names) {
			super();
			this.name = name;
			this.names = names;
		}
}
