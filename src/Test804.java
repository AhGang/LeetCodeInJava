import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;


public class Test804 {
	static String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	static String[] transcode = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	   public  static int uniqueMorseRepresentations(String[] word) {
		   int xnum = 0;
		   String[] link = new String[word.length];//4 gin zen msg gig	
		   for(int i = 0;i<word.length;i++){
			   String x = word[i];
			   link[i] = "";
			   xnum++;
			   for(int j = 0;j<x.length();j++){
				   String xcode = x.substring(j,j+1);
				    
				   for(int z = 0;z<26;z++){
					   if(xcode.equals(transcode[z])){
						   link[i]+=code[z];
						
					   }
					   
				   }
				   
			   }
		   }
		   
		   int num = 0;
		   List<String> list = new ArrayList<String>();    
		    for (int i=0; i<link.length; i++) {    
		        if(!list.contains(link[i])) {    
		            list.add(link[i]);    
		            num++;
		        }    
		    }    
	        return num;
	    }
	   public static void main(String[] args){
		   Scanner sc = new Scanner(System.in);
		   int count = 0;
		   String[] allwords =  new String[101];
		   for(int i = 0;i<100;i++){
			   allwords[i] = sc.nextLine();
			   if(allwords[i].equals("")){
				   break;
			   }
			 count = i+1;
		   }
		   String[] words =  new String[count];
		   for(int i = 0;i<count;i++){
			   words[i] = allwords[i];
			   
		   }
		   System.out.println(uniqueMorseRepresentations(words));
	   }
}
