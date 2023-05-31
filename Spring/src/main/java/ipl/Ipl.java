package ipl;

import java.util.Set;

public class Ipl {
		private int id;
		private Set<String> teams;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public Set<String> getTeams() {
			return teams;
		}
		public void setTeams(Set<String> teams) {
			this.teams = teams;
		}
		@Override
		public String toString() {
			return "Ipl [id=" + id + ", teams=" + teams + "]";
		}
		
}
