package Constructor;

public class local {
	public static void main(String args[]) {
		Human h=new Human("luna","france",20,160,65);
		System.out.println("Name: "+h.getName());
		System.out.println("Location: "+h.getLocation());
		System.out.println("Age: "+h.getAge());
		System.out.println("Height: "+h.getHeight());
		System.out.println("Weight: "+h.getWeight());
		
	}

}
