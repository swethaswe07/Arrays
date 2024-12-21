package practice;

public class palindrome {
    
    private static final int reversedHalf = 0;

	public static void main(String args[]) {
        palindrome p = new palindrome();
        boolean result = p.isPalindrome(11211);
        System.out.print(result);
    }

    boolean isPalindrome(int x) {
        // Negative numbers and numbers ending in 0 (except 0 itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;

	    }

	    // Check if the reversed half is equal to the remaining half
	    return x == reversedHalf || x == reversedHalf / 10;
	}
}	

	

	
	

