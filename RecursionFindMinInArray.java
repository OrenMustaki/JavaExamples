
public class RecursionFindMinInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {51651, 2349, 5341, 65184, 654, 181, 6516, 987, 1651, 65165, 132, 46546, 132134, 1651961, 654, 98, 654, 987654, 32123, 345};
		
		System.out.println(writeArray(a, a.length - 1));
		}
		public static int writeArray(int []a, int b)
		{
			if(b > 0)
				if(a[b] < writeArray(a, b -1))
					return a[b];
				else
					return writeArray(a, b -1);
			else
				return a[b];
		}
	}





