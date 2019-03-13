public class ConstructorExample {
	
		private int num;
		private String name;
		public static int counter=0;
		
		public ConstructorExample(String n, int i)	{
			name = n;
			num = i;
			counter++;
		}
		
		public void say() {
			System.out.printf("%s My name is %s and im %s years old\n",counter, name, num );
		}
		
		public void setit(String n, int i)	{
			name = n;
			num = i;
		}
		
		public void say(String nick) {
			System.out.printf("%s My name is %s aka %s and im %s years old\n",counter, name, nick, num );
		}		
		public void index() {
			System.out.printf("index number is %s\n",counter);
		}
		public static int getindex() {
			return counter;
		}		
}
