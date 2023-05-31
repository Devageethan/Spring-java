package map;

import java.util.Map;

public class Players {
		private Map <Integer,String> names;

		public Players(Map<Integer, String> names) {
			super();
			this.names = names;
		}

		@Override
		public String toString() {
			return "Players [names=" + names + "]";
		}
		
}
