/**
 * @(#)
 * 
 * @author user
 * @version 26 בפבר׳ 2019
 */
public class RecursionPalindrome {
	/**
	 * @param args
	 */
	static String w = "aibohphobiaaibohphobiaaibohphobiakaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiakaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiakaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiakaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiakaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiakaibohphobiaaibohphobiaaibohphobiaoaibohphobiaaibohphobiaaibohphobiakaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiakaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiakaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiakaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiakaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiakaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiakaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiakaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiakaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiakaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiakaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiakaibohphobiaaibohphobiaaibohphobiaoaibohphobiaaibohphobiaaibohphobiakaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiakaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiakaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiakaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiakaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiaaibohphobiakaibohphobiaaibohphobiaaibohphobia";
	
	public static void main(String[] args) {
		System.out.printf("%b", compareLetters(0, w.length() - 1));
	}
	static boolean compareLetters(int i, int j) {
		if(j<i)
			return true;
		return compareLetters(++i, --j) && w.charAt(i) == w.charAt(j);
	}
}
