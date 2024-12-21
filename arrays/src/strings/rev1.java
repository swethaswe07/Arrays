package strings;

public class rev1{
	public static void main(String args[]) {
		String str="hello good morning";
		String[] words=str.split(" ");
		String str1="";
		
			
		
		    for (int i=words.length-1 ;i>=0;i--) {
		    	for(int j=words.length-1 ;j>=0;j--) {
		    		str1+=words[j];
		    }   
		    	
			   
		}
		
		    System.out.println(str1); 
	}
}	
	