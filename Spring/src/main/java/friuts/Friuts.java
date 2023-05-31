package friuts;

import java.util.List;

public class Friuts {
		
		List<String> names;

		public List<String> getNames() {
			return names;
		}

		public void setNames(List<String> names) {
			this.names = names;
		}

		@Override
		public String toString() {
			return "Friuts [names=" + names + "]";
		}
		
}
