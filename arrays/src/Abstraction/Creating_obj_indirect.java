package Abstraction;

public class Creating_obj_indirect {
	
		public static void main(String args[]) {
			CargoPlane c=new CargoPlane();
			c.takeoff();
			c.fly();
			c.land();
		
		plane ref=new plane() {
			@Override
			void fly() {
				System.out.println("plane flew");
				
			}
		};
		
		ref.fly();
		}
    

}
