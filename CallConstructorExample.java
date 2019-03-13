public class CallConstructorExample
{
	
	public static void main(String[] args)
	{
		ConstructorExample person1 = new ConstructorExample("oren", 49);
		person1.say("niko");
		
		person1.index();
		System.out.println(ConstructorExample.getindex());
		
		ConstructorExample person2 = new ConstructorExample("yoav", 11);
		person2.say();

		ConstructorExample person3 = new ConstructorExample("yael", 8);
		person3.say("luli");
		
		person1.index();
		System.out.println(ConstructorExample.getindex());
	}

}
