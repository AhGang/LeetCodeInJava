import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SelfDividingNumbers {
public static List<Integer> selfDividingNumbers(int left, int right) {
     List<Integer> list = new ArrayList<>();
     for(int i = left;i<=right;i++){
    	 String x = i+"";
    	 int flag = 1;
    	 for(int j = 0;j<x.length();j++){
    		 char a =x.charAt(j);
    		 int temp = a -'0';
    		 if(temp==0){
    			 flag = 0;
    			 break;
    		 }
    		 else if(i%temp!=0){
    			 flag = 0;
    			break;
    		 }
    			
    	 }
    	 if(flag==1){
    		 list.add(i);
    	 }
    	 
     }
     return list;
    }
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int left =sc.nextInt();
	int right =sc.nextInt();
	System.out.println(selfDividingNumbers(left,right));
	
}
}
