
public class RecursionFindNthSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findNthSum(6));
	}
	public static int findNthSum(int a)
	{
		if(a == 0)
		{
			return 0;			
		} else {
			return findNthSum(a - 1) + a;
		}
	}
}
