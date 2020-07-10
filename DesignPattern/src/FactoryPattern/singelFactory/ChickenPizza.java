package FactoryPattern.singelFactory;

public class ChickenPizza extends Pizza {

	public ChickenPizza(String name) {
		super(name);
	}

	@Override
	public void prepare() {
			System.out.println("ChickenPizza  is staring");
	}

}
