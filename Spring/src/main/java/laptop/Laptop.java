package laptop;

public class Laptop {
		private String name;
		private String color;
		private int price;
		private String storage;
		
		@Override
		public String toString() {
			return "Laptop [name=" + name + ", color=" + color + ", price=" + price + ", storage=" + storage + "]";
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getStorage() {
			return storage;
		}
		public void setStorage(String storage) {
			this.storage = storage;
		}
		
}
