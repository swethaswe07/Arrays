package strings;

public class vowel {
	public static void main(String args[]) {
		int count=0;
		
		String vowels=new String();
		String words="hello good morning";
		for(int i=0;i<words.length();i++) {
			for(int j=0;j<vowels.length();j++) {
			
			    if(words.charAt(i)==vowels.charAt(j)) {
			
				count++;
				
			    }
			}     
			
			
		}
		
		System.out.println(count);
		
	}

}
