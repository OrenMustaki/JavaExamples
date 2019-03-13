
public class AliasingExample {

	public static void main(String[] args) {

		A a1 = new A(10);
		C c = new C(a1);
		a1.setX(7);
		A a2 = c.getA();
		a2.setX(13);
		System.out.println ("a1 = " + a1);
		System.out.println ("a2 = " + a2);
		System.out.println ("c = " + c);
	} // main



}
