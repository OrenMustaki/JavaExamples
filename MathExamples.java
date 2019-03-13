import java.util.Random;

public class MathExamples {
	public static void main(String[] args)
	{
		Random generator = new Random();
		for( int i=0;i<10; i++)
		{
			int a = generator.nextInt(111);

			System.out.format("%s^%s = %s\n", a, 2, power(a, 2));
			System.out.format("square root of %s is %s\n", power(a, 2), squareroot((double) power(a, 2)));
		}
	}
	public static double power(int a, int b)
	{
		return Math.pow(a, b);
	}
	public static double squareroot(double a)
	{
		return Math.sqrt(a);
	}
}
