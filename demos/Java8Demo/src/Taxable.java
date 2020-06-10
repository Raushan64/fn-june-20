
public interface Taxable {

	public abstract double calcTax();
	
	public default void method() {
		System.out.println("this is default method in Taxable");
	}
	
	public static void showTax() {
		System.out.println("showing tax");
	}
}
