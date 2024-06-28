package plib;

public class MnFactory {
	public static Mn create() {
		return new MnFactory().new MnImple();
	}
	private class MnImple implements Mn{
		public void mndance() {
			System.out.println("dance dance!!");
		}
		@Override
		public void mndiamondsmile() {
			System.out.println("DIAMOND SMILE(^o^)");
		}
	}
}
