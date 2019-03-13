/**
 * 
 */

/**
 * @(#)
 *
 * 
 * @author user
 * @version 26 בפבר׳ 2019
 */
public class FencePostProblem {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		int number = 5040;
		int factor = 1;
		while(factor < (number / 2) + 1)
		{
			if(number % factor == 0)
				{
				System.out.printf("%s", factor);
				if(factor < (number / 2))
					System.out.printf(",", factor);
				}
			factor++;
		}
	}
}
