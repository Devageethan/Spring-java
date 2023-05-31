package avengers;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Avengers {
		private int id;
		private List<String> names;
		private Set<String> powers;
		private Map<Integer ,String> weapons;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public List<String> getNames() {
			return names;
		}
		public void setNames(List<String> names) {
			this.names = names;
		}
		public Set<String> getPowers() {
			return powers;
		}
		public void setPowers(Set<String> powers) {
			this.powers = powers;
		}
		public Map<Integer, String> getWeapons() {
			return weapons;
		}
		public void setWeapons(Map<Integer, String> weapons) {
			this.weapons = weapons;
		}
		@Override
		public String toString() {
			return "Avengers [id=" + id + ", names=" + names + ", powers=" + powers + ", weapons=" + weapons + "]";
		}
		
}
