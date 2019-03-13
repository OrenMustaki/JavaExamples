
public class RecursionSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.println(writeArray(a, a.length - 1));
		}
		public static int writeArray(int []a, int b)
		{
			if(b > 0)
				return a[b] + writeArray(a, b - 1);
			else
				return a[b];
		}
	}





