
public class VehicleApp {
	
	public static void main(String[] args){
		
		Car c = new Car();
		Car d = new Car("Green", "Dodge");
		Admiral b = new Admiral();
		b.setName("Bob");
		c.setDriver(b);
		
		c.driver();
		c.run();
		d.run();
		c.accelerate();
		d.accelerate();
		d.accelerate();
		c.stop();
		d.stop();
	}
}
