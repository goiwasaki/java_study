package pclient;

import java.util.Collections;
import java.util.List;

import comp.Item;
import comp.SampleItemsFactory;
import plib.Mn;
import plib.MnFactory;
import plib.Sample;

public class Main {

	public static void main(String[] args) {
		System.out.println("TEST");
		StudyInnerClass studyInnerClass = new StudyInnerClass();
		StudyInnerClass.Inner inner = studyInnerClass.new Inner();
		System.out.println(inner.name);
		System.out.println(inner.getName());
		
		Sample sample = new Sample();
		System.out.println(sample.getKoro());
	
		Mn mn = MnFactory.create();
		mn.mndiamondsmile();
		
		List<Item> items = SampleItemsFactory.create();
		Collections.sort(items);
		for(Item item : items) {
			System.out.println(item.getName());
		}
	}
}
