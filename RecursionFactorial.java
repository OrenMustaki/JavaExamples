
public class RecursionFactorial {

	public static void main(String[] args) {
		int num = 5;
		double factor = 1;
		for(int i = 1; i <= num; i++)
		{
			factor = factor * i;
		}
		System.out.println(factor);
		System.out.println(findFactor(num));
		
	}
	public static double findFactor(double n)
	{
		if(n<2)
			return 1;
		else
			return n * findFactor(n - 1);
	}


}
