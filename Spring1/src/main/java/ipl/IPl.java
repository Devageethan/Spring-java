package ipl;

import java.util.Set;

public class IPl {
		private Set<String> teams;

		public IPl(Set<String> teams) {
			super();
			this.teams = teams;
		}

		@Override
		public String toString() {
			return "IPl [teams=" + teams + "]";
		}
		
}
