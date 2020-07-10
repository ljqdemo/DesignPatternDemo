package FactoryPattern.singelFactory;

public class PrawnPizza extends Pizza {

	public PrawnPizza(String name) {
		super(name);
	}

	@Override
	public void prepare() {
			System.out.println("PrawnPizza  is staring");
	}

}
