
public class PrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumbers(10);
	}
	public static void printNumbers(int num)
	{
		if(num == 0)
		{
			return;
		} else {
			System.out.println(num);
			printNumbers(num - 1);
		}
	}
}
