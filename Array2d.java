import java.util.Arrays;
import java.util.Random;

public class Array2d {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int array1[][] = {{2, 1, 6, 6, 7, 8, 9, 6, 1, 9},
				{8, 0, 9, 0, 8, 9, 5, 0, 1, 6},
				{2, 1, 6, 6, 8, 4, 5, 6, 9, 2},
				{0, 0, 8, 5, 7, 0, 9, 0, 9, 9},
				{5, 2, 1, 0, 9, 1, 2, 4, 3, 8},
				{2, 7, 9, 6, 8, 2, 0, 3, 4, 3},
				{5, 7, 4, 2, 5, 4, 0, 0, 8, 9},
				{4, 5, 3, 9, 0, 9, 5, 5, 7, 3},
				{6, 5, 2, 2, 9, 7, 0, 1, 1, 8},
				{1, 4, 0, 2, 5, 3, 3, 6, 8, 6}};
		
		int array2[][] = new int[10][10];
		for(int i = 0 ; i < array2.length ; i++)
		{
			for(Integer j = 0 ; j < array2[i].length ; j++)
			{
				array2[i][j] = rand.nextInt((j + 1));
			}
		}
		System.out.println(Arrays.deepToString(array1));
		System.out.println(Arrays.deepToString(array2));
	}
}
