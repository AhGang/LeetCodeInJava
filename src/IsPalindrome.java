import java.util.Scanner;


public class IsPalindrome {
public static boolean isPalindrome(String s) {
	   s = s.toLowerCase();

	    int startIndex = 0;
	    int endIndex = s.length() - 1;
	    while (startIndex < endIndex && startIndex < s.length() - 1) {
	        char pre = s.charAt(startIndex);
	        char aft = s.charAt(endIndex);
	        if (!((pre >= 'a' && pre <= 'z') || (pre >= '0' && pre <= '9'))) {
	            startIndex++;
	            continue;
	        }
	        if (!((aft >= 'a' && aft <= 'z') || (aft >= '0' && aft <= '9'))) {
	            endIndex--;
	            continue;
	        }

	        if (pre != aft) {
	            return false;
	        }
	        startIndex++;
	        endIndex--;
	    }

	    return true;
	
    }
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	System.out.println(isPalindrome(s));
	sc.close();
}
}
