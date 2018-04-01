import java.util.Scanner;


public class IsAnagram {

public static boolean isAnagram(String s, String t) {

        int[] hash = new int[26];//new 一个int数组会自动初始化为0
        for(int i = 0;i<hash.length;i++){
        	 System.out.println(hash[i]);
        }
        for(int i = 0;i<s.length();i++){
       	hash[s.charAt(i)-'a']++;	
        }
        for(int i = 0;i<t.length();i++){
        	        	 hash[t.charAt(i)-'a']--;
        }
       
        for(int i = 0;i<hash.length;i++){
        	if(hash[i]!=0){
        		
        		return false;
        	}
        }
       return true;
    }
public static void main(String args[]){
	Scanner sc  = new Scanner(System.in);
	String s = sc.nextLine();
	String t = sc.nextLine();

		System.out.println(isAnagram(s,t));
		
	
	sc.close();
	
}
}
