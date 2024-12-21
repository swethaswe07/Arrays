package Constructor;

public class vegtest {
	public static void main(String args[]) {
		vegetables v=new vegetables("potato","browm",30,9);
		System.out.println("Name: "+v.getname());
		System.out.println("Color: "+v.getcolor());
		System.out.println("Size: "+v.getsize());
		System.out.println("Cost: "+v.getcost());
		
		
	}

}
