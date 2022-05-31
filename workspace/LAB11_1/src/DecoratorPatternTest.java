//2016112154 정동구
interface Car {
	public void assemble();
}

class BasicCar implements Car {

	BasicCar(){}

	public void assemble() {
		System.out.print("Basic Car.");
	}
}

class CarDecorator implements Car {
	 	
	public CarDecorator(Car c){
		c.assemble();;
	}
	
	public void assemble() {}
}

class SportsCar extends CarDecorator {
	 
	public SportsCar(Car c) {
		super(c);
	}
 
	public void assemble(){
		super.assemble();
		System.out.print(" Adding features of Sports Car.");
	}
}

class LuxuryCar extends CarDecorator {
	 
	public LuxuryCar(Car c) {
		super(c);
	}
 
	public void assemble(){
		super.assemble();
		System.out.print(" Adding features of LuxuryCar Car.");
	}
}

public class DecoratorPatternTest {
	
	public static void main(String[] args) {

		Car sportsCar = new SportsCar(new BasicCar());

		sportsCar.assemble();

		System.out.println("\n*****");

		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar())); sportsLuxuryCar.assemble();

		}


}
