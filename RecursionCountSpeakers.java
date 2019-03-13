
public class RecursionCountSpeakers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countSpeakers(4));
	}
	public static int countSpeakers(int number)
	{
		if(number == 0)
			return number;
		else
			if(number % 2 == 0)
			{
				return 2 + countSpeakers(number - 1);
			} else {
				return 1 + countSpeakers(number - 1);
			}
	}
}
