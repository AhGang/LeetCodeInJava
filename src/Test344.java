import java.util.Scanner;


public class Test344 {
	 public static String reverseString(String s) {
		    if(s==null||s.length()==0){
		    	return s;
		    }
	        char [] array = s.toCharArray();
	        for(int i = 0;i<s.length()/2;i++){
	        	
	        	array[i] = s.charAt(s.length()-1-i);
	        	array[s.length()-1-i] =s.charAt(i); 
	        }
	        
	        return new String(array);
	    }
	 public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 String s = sc.nextLine();
		 System.out.println(reverseString(s));
		 sc.close();
	 }
}
