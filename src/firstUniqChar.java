import java.util.Scanner;


public class firstUniqChar {
	 public static int firstUniqChar(String s) {
		 if(null == s || 0 == s.length() ) return -1;
         int[] hash = new int[26];
         char[] array = s.toCharArray();
         for(int i = 0; i < array.length; i++){      
             int num = array[i] - 'a';
             System.out.println(num);
             hash[num]++;
         }
         for(int i = 0; i < array.length; i++){//´Ó×Ö·û´®³ö·¢
             int num = array[i] - 'a';
             if(hash[num] == 1){
                 return i;
             }
         }
         return -1;
	    }
	 public static void main(String args[]){
		 Scanner sc = new Scanner(System.in);
		 String s = sc.nextLine();
		 System.out.println(firstUniqChar(s));
		 
	 }
}
