package nyTenta2019;

public class C extends B{
	public void whoAreYou() {
		System.out.println("Jag är objekt av C");
		super.whoAreYou();
	}
	public static void whatAreYou() {
		System.out.println("Jag är inte klass C");
	}
}
