
public class RecursionSumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 123456789;

		System.out.println(sumDigits(a));
		}
		public static int sumDigits(int b)
		{
			if(b < 10)
			{
				return b;
			} else {
				return b % 10 + sumDigits(b / 10);
			}
		}
	}





