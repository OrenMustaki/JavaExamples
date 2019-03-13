import java.util.*;

public class ArrayExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int array1[] = {1, 0, 51651, 51, 65184, 2, 3, 4, 5, 10, 4, 6, 3, 7, 9, 95, 2, 234 , 345};
		
		Random generator = new Random();
		int [] arrayR = new int[10];
		for(int i=0 ; i<arrayR.length ; i++)
		{
			arrayR[i] = generator.nextInt(100);
		}
		
		
		ArrayMinMax array = new ArrayMinMax(arrayR);
		System.out.println(array.max);
		System.out.println(array.min);
		
		System.out.println(Arrays.toString(arrayR));
		System.exit(0);
		
		double [] array2 = new double[10];
		String array3[] = new String[10];
		
		for(int i=0 ; i<array2.length ; i++)
		{
			array2[i] = input.nextDouble();
		}	
		System.out.printf("Enter names");
		for(int i=0 ; i<array3.length ; i++)
		{
			array3[i] = input.next();
		}	
		
		for(int i=0 ; i<array1.length ; i++)
		{
			System.out.printf("array1 memeber is : %s\n", array1[i]);
		}
		
		for(int i=0 ; i<array2.length ; i++)
		{
			System.out.printf("array2 memeber is : %s\n", array2[i]);
		}
		
		for(int i=0 ; i<array3.length ; i++)
		{
			System.out.printf("array3 memeber is : %s\n", array3[i]);
		}	
		input.close();
		
		
		
	}

}
