package csk;

import java.util.List;

public class Csk {
		private String color;
		private List<String> players;
		public Csk(String color, List<String> players) {
			super();
			this.color = color;
			this.players = players;
		}
		@Override
		public String toString() {
			return "Csk [color=" + color + ", players=" + players + "]";
		}
		
}
