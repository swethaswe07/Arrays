package Constructor;

public class begin {
	public static void main(String args[]) {
		Car c=new Car("Thar","black",5000000,180,"japan");
		
		System.out.println("Name: "+c.getName());
		System.out.println("Color: "+c.getColor());
		System.out.println("Cost: "+c.getCost());
		System.out.println("TopSpeed: "+c.getTopspeed());
		System.out.println("Country: "+c.getCountry());
		
		
	}

}
