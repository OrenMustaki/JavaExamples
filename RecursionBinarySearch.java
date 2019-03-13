import java.util.Arrays;

public class RecursionBinarySearch {
	static Integer [] array = {1, 2, 3, 4, 6, 8, 11, 15, 18, 19, 23, 28, 30, 41, 50, 67, 79, 89, 90, 101, 120, 129, 142, 149, 156, 162, 180, 201, 230};
//	static Integer [] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    static int search = 18;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringSearch(array));
	}
	public static int stringSearch(Integer [] array)
	{
		int mid = array.length / 2;

		if(array[mid] == search)
		{
			return mid;
		}
		if(array.length == 1 && array[mid] != search)
		{
			System.out.printf("Could not find %s in array", search);
			System.exit(1);
			return mid;
		}
		else {
			if(array[mid] < search)
				return mid + stringSearch(Arrays.copyOfRange(array, mid, array.length));
			else
				return stringSearch(Arrays.copyOfRange(array, 0, mid));
		}
	}
}
