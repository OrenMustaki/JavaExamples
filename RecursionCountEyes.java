public class RecursionCountEyes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cats = 10;
		System.out.println(countEyes(cats));
	}
	public static int countEyes(int cats)
	{
		if(cats == 0)
		{
			return 0;
		} else {
			return 2 + countEyes(cats - 1);
		}
	}
}
