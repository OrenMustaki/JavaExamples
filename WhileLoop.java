public class WhileLoop {

	public static void main(String[] args) {
		
		int i = 0;
		while(i<10)
		{
			System.out.printf("loop 1 : %s\n", i++);
		}
		
		
		do
		{
			System.out.printf("loop 2 : %s\n", i++);
		}
		while(i<20);

	}

}
