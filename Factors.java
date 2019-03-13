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
public class Factors {
	
	static int count(int number)
	{
		int factors = 0;
		int factor = 1;
		while(factor < (number / 2) + 1)
		{
			if(number % factor == 0)
				factors++;
			factor++;
		}
		return factors;
	}
}