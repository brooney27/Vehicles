
public class Car extends Vehicle{
	private String color;
	private String model;
	private int speed;
	private Admiral a;
	
	public Car(){
		color = "Blue";
		model = "Camry";
		speed = 0;
	}
	
	public Car(String color, String model){
		this.color = color;
		this.model = model;
		speed = 0;
	}
	
	public void setColor(String input){
		color = input;
	}
	public String getColor(){
		return color;
	}
	
	public void setModel(String input){
		model = input;
	}
	public String getModel(){
		return model;
	}
	
	public void setSpeed(int input){
		speed = input;
	}
	public int getSpeed(){
		return speed;
	}
	
	public void run(){
		System.out.println("The " + color + " " + model + " starts");
	}
	
	public void accelerate(){
		speed+=10;
		System.out.println("The " + color + model + " speeds up to " + speed + " mph");
	}
	
	public void stop(){
		speed = 0;
		System.out.println("The " + color + " " + model + " stops");
	}
	
	public void driver(){
		System.out.println("The " + color + " " + model + " is driven by " + this.getDriver().getName());
	}
	
	public void setDriver(Admiral ad){
		a = ad;
	}
	public Admiral getDriver(){
		return a;
	}
}
