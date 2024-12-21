package strings;

public class buffer {
	public static void main(String args[]) {
		StringBuffer str=new StringBuffer("hello");
		StringBuffer str1=new StringBuffer("hello");
		System.out.println(str==str1);
		System.out.println(str.equals(str1));
	}

}