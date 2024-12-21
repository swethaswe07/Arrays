package strings;

public class str1 {
	public static void main(String args[]) {
		int count=0;

		String words="hello good morning";
		for(int i=0;i<words.length();i++) {
			if(words.charAt(i)==' ') {
				count++;
			}
			
			
		}
		count++;
		System.out.println(count);
		
	}

}
