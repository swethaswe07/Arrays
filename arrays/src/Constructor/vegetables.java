package Constructor;

public class vegetables {
	private String name;
	private String color;
	private int cost;
	private int size;
	
	vegetables(String name,String color, int cost,int size){
		this.name=name;
		this.color=color;
		this.cost=cost;
		this.size=size;
		
	}
	public String getname() {
		return name;
	}
	public String getcolor() {
		return color;
	}
	public int getcost() {
		return cost;
	}
	public int getsize() {
		return size;
	}

}
