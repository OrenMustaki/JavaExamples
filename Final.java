
public class Final {

	private String name;
	private final int EYES = 2;
	
	public Final(String n)
	{
		name = n;
		System.out.println(name);
		System.out.println(EYES);
		// EYES = 1; will not work
	}

}
