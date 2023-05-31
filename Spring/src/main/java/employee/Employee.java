package employee;

import java.util.Map;

public class Employee {
		private Map<Integer,String> details;

		public Map<Integer, String> getDetails() {
			return details;
		}

		public void setDetails(Map<Integer, String> details) {
			this.details = details;
		}

		@Override
		public String toString() {
			return "Employee [details=" + details + "]";
		}
		
}
