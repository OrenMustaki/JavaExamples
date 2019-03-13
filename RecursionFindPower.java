
public class RecursionFindPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findPower(10, 4));
	}
	public static int findPower(int number, int power)
	{
		if(power == 1)
			return number;
		else
			return number * findPower(number, power - 1);
	}
}
