package pclient;

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
	}
}
