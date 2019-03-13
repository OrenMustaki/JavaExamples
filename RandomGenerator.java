import java.util.Random;

public class RandomGenerator {
	public static void main(String [] args)
	{
		Random generator = new Random();
		
		System.out.println(generator.nextInt());
		System.out.println(generator.nextInt());
		System.out.println(generator.nextLong());
		System.out.println(generator.nextLong());
		System.out.println(generator.nextDouble());
		System.out.println(generator.nextDouble());
		System.out.println(generator.nextFloat());
		System.out.println(generator.nextFloat());
		System.out.println(generator.nextGaussian());
		System.out.println(generator.nextGaussian());
		System.out.println(generator.nextBoolean());
		System.out.println(generator.nextBoolean());
		
	}
}
