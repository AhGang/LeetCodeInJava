import java.util.Scanner;


public class Test12 {
	 public static String intToRoman(int num) {
		 String ans = "";  
	     int[] aArray = {1000,900,500,400,100,90,50,40,10,9,5,4,1};  
		 String[] rArray = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		 for(int i = 0; i < aArray.length; i++){  
	            while(num>=aArray[i]){  
	                ans += rArray[i];  
	                num -= aArray[i];  
	            }  
	        }  
		 return ans;
	    }
	 public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 int x =sc.nextInt();
		 System.out.println(intToRoman(x));
		 sc.close();
		 
	 }
}
