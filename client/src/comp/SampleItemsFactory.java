package comp;

import java.util.Arrays;
import java.util.List;

public class SampleItemsFactory {
	public static List<Item> create(){
		List<Item> items = Arrays.asList(
				new Item[] {
						new Item("orange", 100),
						new Item("banana", 80),
						new Item("apple", 120)
				});
		return items;
	}
}

