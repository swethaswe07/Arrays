package encapsulation;

public class doglaunch {
	public static void main(String args[]) {
		dog d=new dog();
		d.setName("julie");
		d.setColor("black");
		d.setCost("30000");
		d.setBreed("golden retriver");
		
		System.out.println("Name: "+d.getName());
		System.out.println("Color: "+d.getColor());
		System.out.println("Cost: "+d.getCost());
		System.out.println("Breed: "+d.getBreed());
	}

}
