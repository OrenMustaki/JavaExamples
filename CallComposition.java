
public class CallComposition {

	public static void main(String[] args) {
		Composition car1 = new Composition("Honda", "Civic", 4);
		Composition car2 = new Composition(car1);
		
		car1.price = 120000;
		car2.price = 100000;
		car1.year = 2018;
		car2.year = 2017;		
		
		Composition car3 = new Composition(car1);

		System.out.printf("%s %s %s %s %s \n", car1.maker, car1.model, car1.price, car1.wheels, car1.year);
		System.out.printf("%s %s %s %s %s \n", car2.maker, car2.model, car2.price, car2.wheels, car2.year);
		System.out.printf("%s %s %s %s %s \n", car3.maker, car3.model, car3.price, car3.wheels, car3.year);

	}

}