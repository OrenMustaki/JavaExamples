
public class ObjectComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("test");
		String str2 = new String("test");
		
		if(str1 == str2)
			System.out.printf("String == comparison %s == %s\n", str1, str2);
		else
			System.out.printf("String == comparison %s != %s\n", str1, str2);
		
		if(str1.equals(str2))
			System.out.printf("String equals comparison %s equals %s\n", str1, str2);
		else
			System.out.printf("String equals comparison %s not equals %s\n", str1, str2);

		System.out.printf("Lexicographic distance between strings%s\n", str1.compareTo(str2));
	
		
	}

}
