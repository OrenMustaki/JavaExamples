
public class ForLoop {
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
		    System.out.println(i);
		}
		for(int i=0, j=10; i<j; j++, i++){
			i++;
		    System.out.printf("%s %s\n", i, j);
		}
	}
}
