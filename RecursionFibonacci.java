public class RecursionFibonacci {
	public static void main(String[] args) {
		
		System.out.println(fibonacci(40));
	}
	public static double fibonacci(double b)
	{
		if(b == 0)
			return 0;
		else if(b == 1)
			return 1;
		else
			return fibonacci(b - 1) + fibonacci(b - 2);
	}
}
