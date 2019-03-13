
public class RecursionCountDigits {
	static int digit = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 919999999;
		System.out.println(countDigits(b));
		}
		public static int countDigits(int a)
		{
			if(a < 10)
				return (a == digit) ? 1 : 0;
			else
				return (a % 10 == digit) ? 1 + countDigits(a / 10) : countDigits(a / 10);
		}
}






