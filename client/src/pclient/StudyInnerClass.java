package pclient;

public class StudyInnerClass {
	private	static String name = "Outer";
	public class Inner{
		String name = "Inner";
		String getName() {
			return StudyInnerClass.name;
		}
	}
}
