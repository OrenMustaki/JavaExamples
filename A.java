public class A
{
	// Instance variable
	private double _x;
	// 3 constructors
	public A(double x) {
		_x= x;
	}
	public A() {
		_x= 0;
	}
	public A(A a) {
		_x = a.getX();
	}
	// methods
	public double getX() {
		return _x;
	}
	public void setX(double x) {
		_x = x;
	}
	public String toString() {
		return "A:" + _x;
	}
} // class