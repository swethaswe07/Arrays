package strings;

public class bufferstr {
	public static void main(String args[]) {
		String s=new String("Super");
		s.concat("Software");
		System.out.println(s);
		StringBuffer sb= new StringBuffer("super ");
		sb.append("software");
		System.out.println(sb);
		
	}

}
