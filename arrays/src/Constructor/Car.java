package Constructor;

public class Car {
	private String name;
	private String color;
	private int cost;
	private int topSpeed;
	private String Country;
    Car(String a, String b,int c,int d,String e){
		super();
		name=a;
		color=b;
		cost=c;
		topSpeed=d;
		Country=e;
		
    }
	public String getName() {
    	return name;
    }
    public String getColor() {
    	return color;
    }
    public int getCost() {
    	return cost;
    }
    public int getTopspeed() {
    	return topSpeed;
    }
    public String getCountry() {
    	return Country;
    }

}
