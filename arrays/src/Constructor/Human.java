package Constructor;

public class Human {
	private String name;
	private String location;
	private int age;
	private double height;
    private double weight;
    Human(String a,String b,int c,double d, double e){
    	this("Sunjae","korea",19,160);
    	name=a;
    	location=b;
    	age=c;
    	height=d;
    	weight=e;
    }
    Human(String a,String b,int c,double d){
    	this("Suzume","Japan",25);
    	name=a;
    	location=b;
    	age=c;
    	height=d;
    }
    Human(String a,String b,int c){
    	
    	name=a;
    	location=b;
    	age=c;
    	
    }	
    public String getName() {
    	return name;
    }
    public String getLocation() {
    	return location;
    }
    public int getAge() {
    	return age;
    }
    public double getHeight() {
    	return height;
    }
    public double getWeight() {
    	return weight;
    }
}
