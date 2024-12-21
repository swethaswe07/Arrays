package strings;

public class builder1 {
	public static void main(String args[]) {
		StringBuilder str=new StringBuilder("hello");
		StringBuilder str1=new StringBuilder("hello");
		System.out.println(str==str1);
		System.out.println(str.equals(str1));
	}

}