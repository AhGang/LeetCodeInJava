import java.util.Scanner;


public class StringReverse {
	 public static int reverse(int x) {
		 boolean flag = true;
		 int result;
		 if(x<0){
			 x = -x;
			 flag = false;
		 }
	     String str=x+"";
	     String reversex="";
	     int count=0;
	     for(int i = str.length();i>0;i--){
	    	 if((count==0)&&(str.substring(i-1,i)=="0")){
	    		 continue;
	    	 }
	    	 
	    	 else{
	    		 reversex +=str.substring(i-1,i);
	    		 count++;
	    	 }
	     }
	     try{
	         result = Integer.parseInt(reversex);;
	     }catch (NumberFormatException e){
	         return 0;
	     }

	        if(flag){
	        	return  Integer.parseInt(reversex);
	        }
	        else{
	        	return  -Integer.parseInt(reversex);
	        }
	        
	    }
	 public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 int x = sc.nextInt();
		 System.out.println(reverse(x));
		 
	 }
	
}
