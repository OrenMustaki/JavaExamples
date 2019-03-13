public class Composition
{
	public String maker, model, owner;
	public int wheels;
	public int year, price;

	public Composition(String mk, String md, int w)
	{
		maker = mk;
		model = md;
		wheels = w;
	}
	public Composition(Composition vehicle)
	{
		maker = vehicle.maker;
		model = vehicle.model;
		wheels = vehicle.wheels;
		year = vehicle.year;
		price = vehicle.price;
	}
}