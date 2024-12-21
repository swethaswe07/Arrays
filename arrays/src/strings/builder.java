package strings;

public class builder {
	//same as buffer but it is fast and doesnt have security
	
	
		public static void main(String args[]) {
			String s=new String("Super");
			s.concat("Software");
			System.out.println(s);
			StringBuilder sb= new StringBuilder("super ");
			sb.append("software");
			System.out.println(sb);
			
		}

	


}
