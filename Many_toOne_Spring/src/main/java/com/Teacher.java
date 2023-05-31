package com;

import java.util.List;

public class Teacher {
		private String name;
		private String subject;
		private List<Students> students;
		@Override
		public String toString() {
			return "Teacher [name=" + name + ", subject=" + subject + ", students=" + students + "]";
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		public List<Students> getStudents() {
			return students;
		}
		public void setStudents(List<Students> students) {
			this.students = students;
		}
		
}
