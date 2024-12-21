package Abstraction;

public class launchArea {
	public static void main(String args[]) {
		circle c=new circle();
		c.CollectData();
		c.Calculate();
		c.Display();
		rectangle_area r=new rectangle_area();
		r.CollectData();
		r.Calculate();
		r.Display();
		tri t=new tri();
		t.CollectData();
		t.Calculate();
		t.Display();
	}
	
	

}
