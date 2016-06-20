
public class VehicleApp {
	
	public static void main(String[] args){
		
		Car c = new Car();
		Car d = new Car("Green", "Dodge");
		
		c.run();
		d.run();
		c.accelerate();
		d.accelerate();
		d.accelerate();
		c.stop();
		d.stop();
	}
}
