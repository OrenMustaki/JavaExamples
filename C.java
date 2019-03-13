public class C{
	private A _a;
	
	public C(A a){
		_a = new A(a);
	}
	public A getA(){
		return new A(_a);
	}
	public String toString(){
		return "C:" + _a;
	}

}