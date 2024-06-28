package comp;

import java.util.Comparator;

public class Item implements Comparable<Item>{
	private String name;
	private int price;
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public int compareTo(Item target) {
		return name.compareTo(target.name);
	}
	public static class PriceComparator implements Comparator<Item>{
		@Override
		public int compare(Item a, Item b) {
			if(a.getPrice() < b.getPrice()) {
				return -1;
			}
			if(b.getPrice() < a.getPrice()) {
				return 1;
			}
			return 0;
		}
	}
}
